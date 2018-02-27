package org.gradle.sample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2/22/2018.
 */
public class GreeterTest {

  private Greeter greeter;

  /**
   * This method execute before any test.
   */
  @Before
  public void setUp() {
    greeter = new Greeter();
  }

  /**
   * First Test.
   */
  @Test
  public void firstTest() throws Exception {
    final String actualResult = "hello Gradle";
    final String expectedResult = greeter.getGreeting();
    assertEquals(expectedResult, actualResult);
  }

  /**
   * Second Test.
   */
  @Test
  public void secondTest() throws Exception {
    final String actualResult = "hello Gradle";
    final String expectedResult = greeter.getGreeting();
    assertEquals(expectedResult, actualResult);
  }

  /**
   * Third Test.
   */
  @Test
  public void thirdTest() throws Exception {
    final String actualResult = "hello Gradle";
    final String expectedResult = greeter.getGreeting();
    assertEquals(expectedResult, actualResult);
  }

  /**
   * Fourth Test.
   */
  @Test
  public void fourthTest() throws Exception {
    final String actualResult = "hello Gradle";
    final String expectedResult = greeter.getGreeting();
    assertEquals(expectedResult, actualResult);
  }

  /**
   * Fifth Test.
   */
  @Test
  public void fifthTest() throws Exception {
    final String actualResult = "hello Gradle";
    final String expectedResult = greeter.getGreeting();
    assertEquals(expectedResult, actualResult);
  }

  /**
   * Sixth Test.
   */
  @Test
  public void sixthTest() throws Exception {
    final String actualResult = "hello Gradle";
    final String expectedResult = greeter.getGreeting();
    assertEquals(expectedResult, actualResult);
  }

  /**
   * Seventh Test.
   */
  @Test
  public void seventhTest() throws Exception {
    final String actualResult = "hello Gradle";
    final String expectedResult = greeter.getGreeting();
    assertEquals(expectedResult, actualResult);
  }

  /**
   * Eighth Test.
   */
  @Test
  public void eighthTest() throws Exception {
    final String actualResult = "hello Gradle";
    final String expectedResult = greeter.getGreeting();
    assertEquals(expectedResult, actualResult);
  }

  /**
   * Ninth Test.
   */
  @Test
  public void ninthTest() throws Exception {
    final String actualResult = "hello Gradle";
    final String expectedResult = greeter.getGreeting();
    assertEquals(expectedResult, actualResult);
  }

  /**
   * Tenth Test.
   */
  @Test
  public void tenthTest() throws Exception {
    final String actualResult = "hello Gradle";
    final String expectedResult = greeter.getGreeting();
    assertEquals(expectedResult, actualResult);
  }
}