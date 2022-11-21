Feature: Test suite for login
Scenario: login with valid credentails
 Given I navigate to thz login page
 When I entre username
 And I enter password
 And I click on login button
 Then I should be redirected to the landing page