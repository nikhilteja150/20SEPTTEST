Feature: Functional testing in testme app
 Scenario: Valid login
 
    Given User has launched testme app in the browser
   When User enters "lalitha" and "Password123" 
    And click on the login button
    Then user must be logged in successfully