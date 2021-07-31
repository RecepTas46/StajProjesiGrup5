Feature: City delete Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page
  @SetupParameters
  Scenario: Create and delete a country and a city
    When Create a country name as "Uranus" code as "UR15"
    Then Success message should be displayed

    When Create a city name as "Urcapital" for "Uranus"
    Then Success message should be displayed

    When Delete the "Uranus"
    Then Can not be deleted message should be displayed

    When Delete the city "Urcapital" for "Uranus"
    Then Success message should be displayed

    When Delete the "Uranus"
    Then Success message should be displayed




