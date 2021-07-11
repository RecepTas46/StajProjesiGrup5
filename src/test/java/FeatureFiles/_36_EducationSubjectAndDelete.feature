Feature: Education Create and Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to education pageSubject

  Scenario: Create a Subject Education
    When Create a subject education name as "subjectTarik" code as "code5"
    Then Success message should be displayed

    Scenario: Create Subject delete
    When User delete the "subjectTarik"
    Then Success message should be displayed



