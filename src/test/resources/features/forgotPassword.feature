@wip
Feature: Forgot your password functionality
  User story: As a user I should be able to see error message when enter wrong email in forgot password page

  Scenario: Error message when enter wrong email in forgot password page

    Given user is on a truck driver login page
    When  user click on Forgot your password button
    And   user enters invalid email on forgot password page
    And   user click on Request button
    Then  error message appears