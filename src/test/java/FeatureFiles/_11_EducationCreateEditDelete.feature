Feature: Country Create Edit Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to education page

  Scenario: Create a Education
    When Create a education name as "grup5" code as "code5"
    Then Success message should be displayed

  Scenario: Edit a Education

    When User edit the "grup5" to "grup05"
    Then Success message should be displayed

  Scenario: Delete a Education

    When User delete the "grup05"
    Then Success message should be displayed
