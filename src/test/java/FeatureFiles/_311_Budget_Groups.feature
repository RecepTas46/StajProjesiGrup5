Feature: Create edit and delete a BudgetGroups Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Budget page


  Scenario: Create edit and delete a BudgetGroups
    When Create a Budget definition as "Gider12"  comment as "Yorum"
    When Click  start_End_Date and enter Comment
    Then Success message should be displayed
    When User edit budget the "Gider12" to "Gider22"
    Then Success message should be displayed
    When Delete Budget "Gider22"
    Then Success message should be displayed


