Feature: Login Functionality

  Scenario: Valid login
    And user navigates to login page
    When user enters as standard_user and secret_sauce
    Then we need to see home page