Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page
  @RegressionTest
  Scenario: Create a country
    When Create a country
    Then Success message should be displayed
  @RegressionTest
  Scenario:  Create a country parameter data
    When Create a country name as "recep23" code as "code23"
    Then Success message should be displayed
