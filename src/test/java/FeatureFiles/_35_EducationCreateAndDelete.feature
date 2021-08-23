Feature: Education Create and Delete Subject Catagories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to education page

  @EducationExtentReport
  Scenario: Create a Education
    When Create a education name as "grup5" code as "code15"
    Then Success message should be displayed

    When User delete the "grup5"
    Then Success message should be displayed
