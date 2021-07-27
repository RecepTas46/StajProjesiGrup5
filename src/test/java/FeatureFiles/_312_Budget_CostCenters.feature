Feature: Create edit and delete a Cost Centers Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Budget page


  Scenario: Create edit and delete a Cost Centers
    When Create a Cost Centers name as "nameee" as "codee" as "expensee,"
    When select type and click btnSave
    Then Success message should be displayed
    When edit budget Cost "nameee" to "nameeex"
    Then Success message should be displayed
    When Delete Budget "nameeex"
    Then Success message should be displayed

