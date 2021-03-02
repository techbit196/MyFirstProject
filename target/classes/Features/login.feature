Feature: Test Login

  Scenario: Testing Login
    Given User is on homepage
    And Login as admin
    Then User navigate to dashboard
#    And enters <name> and <password>