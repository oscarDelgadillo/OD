require 'vagrant-openstack-provider'

Vagrant.configure("2") do |config|
  # The most common configuration options are documented and commented below.
  # For a complete reference, please see the online documentation at
  # https://docs.vagrantup.com.

  # Every Vagrant development environment requires a box. You can search for
  # boxes at https://vagrantcloud.com/search.
  
	config.env.enable
	config.ssh.username = 'ubuntu'
	config.ssh.private_key_path = ENV['KEY_PATH']

	config.vm.provision "docker"
	config.vm.provision "docker_compose"
	
	config.vm.provider :openstack do |os, override|
		os.identity_api_version = '3'
		os.openstack_auth_url 	= ENV['OS_AUTH_URL']
		os.username 			= ENV['OS_USERNAME']
		os.password 			= ENV['OS_PASSWORD']
		os.domain_name 			= ENV['OS_DOMAIN_NAME']
		os.tenant_name 			= ENV['OS_TENANT_NAME']
		os.project_name 		= ENV['OS_PROJECT_NAME']
		os.flavor 				= ENV['OS_FLAVOR']
		os.image 				= ENV['OS_IMAGE']
		os.keypair_name 		= ENV['OS_KEY_PAIR_NAME']
		os.server_name 			= 'os_ubuntu16'
		override.vm.synced_folder '.', '/vagrant', disabled: true
	end
  
  #config.vm.box = "base"

  # Disable automatic box update checking. If you disable this, then
  # boxes will only be checked for updates when the user runs
  # `vagrant box outdated`. This is not recommended.
  # config.vm.box_check_update = false

  # Create a forwarded port mapping which allows access to a specific port
  # within the machine from a port on the host machine. In the example below,
  # accessing "localhost:8080" will access port 80 on the guest machine.
  # NOTE: This will enable public access to the opened port
  # config.vm.network "forwarded_port", guest: 80, host: 8080

  # Create a forwarded port mapping which allows access to a specific port
  # within the machine from a port on the host machine and only allow access
  # via 127.0.0.1 to disable public access
  # config.vm.network "forwarded_port", guest: 80, host: 8080, host_ip: "127.0.0.1"

  # Create a private network, which allows host-only access to the machine
  # using a specific IP.
  # config.vm.network "private_network", ip: "192.168.33.10"

  # Create a public network, which generally matched to bridged network.
  # Bridged networks make the machine appear as another physical device on
  # your network.
  # config.vm.network "public_network"

  # Share an additional folder to the guest VM. The first argument is
  # the path on the host to the actual folder. The second argument is
  # the path on the guest to mount the folder. And the optional third
  # argument is a set of non-required options.
  # config.vm.synced_folder "../data", "/vagrant_data"

  # Provider-specific configuration so you can fine-tune various
  # backing providers for Vagrant. These expose provider-specific options.
  # Example for VirtualBox:
  #
  # config.vm.provider "virtualbox" do |vb|
  # config.vm.provider "vagrant-openstack-provider" do |osp|
  #   # Display the VirtualBox GUI when booting the machine
  #   vb.gui = true
  #   osp.gui = false
  #
  #   # Customize the amount of memory on the VM:
  #   vb.memory = "2048"
  #   osp.memory = "512"
  #	end
  #
  # View the documentation for the provider you are using for more
  # information on available options.

  # Enable provisioning with a shell script. Additional provisioners such as
  # Puppet, Chef, Ansible, Salt, and Docker are also available. Please see the
  # documentation for more information about their specific syntax and use.
  # config.vm.provision "shell", inline: <<-SHELL
  #   apt-get update
  #   apt-get install -y apache2
  # SHELL
end
