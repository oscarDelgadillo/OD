pipeline {
    agent any

	options {
    // Keep the 10 most recent builds
    buildDiscarder(logRotator(numToKeepStr:'10')) 
	}

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
				sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
				sh './gradlew clean check'
				
				post {
					success {
					  // publish html
					  publishHTML target: [
							allowMissing: false,
							alwaysLinkToLastBuild: false,
							keepAll: true,
							reportDir: 'build/reports/tests/test',
							reportFiles: 'index.html',
							reportName: 'Unit Test Report'
						]
					}
				}
            }
        }
		stage('Package') {
            steps {
                echo 'Packaging..'
				sh './gradlew clean war'
				
				post {
					success {
					  // Archive the built artifacts
					  archive includes: 'build/libs/*.war'
					}
				}
            }
        }		
        stage('CodeQuality') {
            steps {
                echo 'Code Quality....'
				sh './gradlew sonarqube -Dsonar.host.url=http://sonarqube:9000'
            }
        }
    }
}