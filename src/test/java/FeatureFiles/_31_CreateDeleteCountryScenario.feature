Feature: Create and delete a country Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page
  @Regression
  Scenario: Create and delete a country
    When Create a country name as "Technocity" code as "tc21"
    Then Success message should be displayed
    When Delete the "Technocity"
    Then Success message should be displayed
