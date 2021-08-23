Feature: Education Create and Delete Subject and Catagories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to education page

  @EducationExtentReport
  Scenario: Create a Education
    When Create a education name as "MySubjectCat" code as "cod5"
    Then Success message should be displayed

    When Create a subject new Education name as "syuleyman" code as "code005"
    Then Success message should be displayed

    When User delete the "MySubjectCat"
    Then Can not be deleted message should be displayed

    When User delete subject the "syuleyman"
    Then Success message should be displayed

    When User delete the "MySubjectCat"
    Then Success message should be displayed



