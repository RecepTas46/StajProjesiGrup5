Feature: Country Create Edit Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Create a country
    When Create a country name as "recep012" code as "code13"
    Then Success message should be displayed

  Scenario: Edit a country

    When User edit the "recep012" to "recep2"
    Then Success message should be displayed

  Scenario: Delete a country

    When User delete the "recep2"
    Then Success message should be displayed
