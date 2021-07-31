Feature: SOMECOUNTRY Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page
  @SetupParameters
  Scenario: Create SOMECOUNTRY and a city
    When Create a country name as "SOMECOUNTRY" code as "SC21"
    Then Success message should be displayed
    When Create a city name as "SOMECAPITAL" for "SOMECOUNTRY"
    Then Success message should be displayed
    When Delete the "SOMECOUNTRY"
    Then Can not be deleted message should be displayed

    When Delete the city "SOMECAPITAL" for "SOMECOUNTRY"
    Then Success message should be displayed

    When Delete the "SOMECOUNTRY"
    Then Success message should be displayed
