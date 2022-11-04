
Feature: Login page functionality
  User story: As a user I should be able to login with correct credentials

  Background:
    Given user is on a truck driver login page

  Scenario: Login as a Truck driver

    When  user enters truck driver's user name
    And   user enters truck driver's password
    And   user click on Log In button
    Then  user successfully logged in and user sees main page

