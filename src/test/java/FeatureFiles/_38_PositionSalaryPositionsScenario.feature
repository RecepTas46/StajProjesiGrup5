Feature: Position salary and positions

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to human resources page

  @HumanResourcesSetup
  Scenario: Create and delete a position salary
   When Create a position salary name as "Computer Systems Analyst"
   Then Success message should be displayed

   When Edit position salary "Computer Systems Analyst" as "Systems Analyst"
   Then Success message should be displayed

   When Delete the position salary "Systems Analyst"
   Then Success message should be displayed

   And Navigate to Positions page
  # Scenario: Create and delete a position
   When Create a position name as "IT Testing Branch Head" short name as "BH01"
   Then Success message should be displayed

   When Edit the position "IT Testing Branch Head" as "IT Tester" short name as "IT01"
   Then Success message should be displayed

   When Delete the position "IT Tester"
   Then Success message should be displayed