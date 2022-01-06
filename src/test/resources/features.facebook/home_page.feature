Feature: As a user try to login FB

  Scenario : Facebook login
    Given I open facebook login page
    When I input email and password
    When I click button login
    Then I can see my news feed



