Feature: Create and delete a city Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page
  @SetupParameters
  Scenario: Create and delete a city
    When Create a country name as "Sirus" code as "SR21"
    Then Success message should be displayed
    When Create a city name as "Capitale" for "Sirus"
    Then Success message should be displayed
    When Delete the city "Capitale" for "Sirus"
    Then Success message should be displayed
    When Delete the "Sirus"
    Then Success message should be displayed
