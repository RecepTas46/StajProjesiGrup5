Feature: Education Create and Delete Subject

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to education page

  @EducationExtentReport
  Scenario: Create a Subject Education
    When Create a subject education name as "subjectTarik" code as "code05"
    Then Success message should be displayed

    When User delete subject the "subjectTarik"
    Then Success message should be displayed



