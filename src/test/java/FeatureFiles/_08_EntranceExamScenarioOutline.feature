#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption | GradeLevelOption |
#| Math exam is1   | academicPeriod2              | option4  |
#| IT exam is1     | academicPeriod2              | option1  |
#| Oracle exam is1 | academicPeriod2              | option2  |
#| Math exam  is1  | academicPeriod2              | option3  |

Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Create a Country
    And Click on the element in the left Nav
      | entranceExamsOne |
      | setupTree        |
      | entranceExamsTwo |

    And Click on the element in the Dialog
      | addButton |

    When User sending the keys in dialog content
      | nameInput | <ExamName> |

    And Click on the element in the Form Content
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |
      | saveButton             |

    Then Success message should be displayed

    And Click on the element in the left Nav
      | entranceExamsOne |
      | setupTree        |
      | entranceExamsTwo |

    When User delete the  "<ExamName>" from Form
    Then Success message should be displayed
    Examples:

      | ExamName         | AcademicPeriodOption | GradeLevelOption |
      | Math exam rcp1   | academicPeriod2      | option4          |
      | IT exam rcp1     | academicPeriod2      | option2          |
      | Oracle exam rcp1 | academicPeriod2      | option3          |
      | Math exam  rcp1  | academicPeriod2      | option1          |