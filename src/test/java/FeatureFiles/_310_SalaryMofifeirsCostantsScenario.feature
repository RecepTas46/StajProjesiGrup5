Feature: Salary Modifiers and Constants

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to human resources page
  @HumanResourcesSetup
  Scenario: Create and delete a Salary Modifiers
    When Create a salary Modifiers name as "Kinder Geld"
    Then Success message should be displayed

    When Edit salary Modifiers "Kinder Geld" as "Kinder Geld per each child"
    Then Success message should be displayed

    When Delete the salary Modifiers "Kinder Geld per each child"
    Then Success message should be displayed

    And Navigate to Salary Constants page

 # Scenario: Create and delete a Salary Constants
    When Create a Salary Constants name as "Team leader" key input as "TL"
    Then Success message should be displayed

    When Edit Salary Constants "Team leader" as "Project leader"
    Then Success message should be displayed

    When Delete Salary Constants "Project leader"
    Then Success message should be displayed