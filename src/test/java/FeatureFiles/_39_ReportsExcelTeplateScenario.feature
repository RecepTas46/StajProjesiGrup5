Feature: Create Excel Template and Salary Types

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to reports page
  @HumanResourcesSetup
  Scenario: Create and a new Excel Template
    When Create a Excel Template name as "Simple Budget Planner"
    Then Success message should be displayed
    Then Create the version part
    Then Success message should be displayed


    When Edit the Excel Template "Simple Budget Planner" as "Simple Monthly Budget Template"
    Then Success message should be displayed

    When Delete the Excel Template "Simple Monthly Budget Template"
    Then Success message should be displayed

    And Navigate to Salary Types page
#  # Scenario: Create and delete a Salary Types
    When Create a Salary Types name as "Performance Pay"
    Then Success message should be displayed

    When Edit Salary Types "Performance Pay" as "Performance Pay for everyone"
    Then Success message should be displayed

    When Delete Salary Types "Performance Pay for everyone"
    Then Success message should be displayed