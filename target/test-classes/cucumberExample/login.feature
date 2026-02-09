Feature: Login Functionality

  Scenario: Valid login
    Given User open the browser
    And user navigates to login page
    When user enters as standard_user and secret_sauce
    Then we need to see home page

  Scenario: InValidUsername login
    Given User open the browser
    And user navigates to login page
    When user enters as "think"  and "secret_sauce"
    Then error message should be displayed

  Scenario: InValidPassword login
    Given User open the browser
    And user navigates to login page
    When user enters as "standard_user"  and "second"
    Then error message should be displayed

  Scenario Outline: inValid logins

    Given User open the browser
    And user navigates to login page
    When user enters as "<username>"  and "<password>"
    Then error message should be displayed
    
   Examples:
      | username | password |
      | asgg   | pass1234 |
      | pass23 | pass1234 |
      | passj   |pasjjj980 | 
    
    
    
    
    
    
    
    
    
