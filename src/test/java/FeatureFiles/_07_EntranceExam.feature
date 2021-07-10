#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız


Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Create a Country
    And Click on the element in the left Nav
      | entranceExamsOne |
      | setupTree        |
      | entranceExamsTwo |

    And Click on the element in the Dialog
      | addButton |

    When User sending the keys in dialog content
      | nameInput | recepExam18 |

    And Click on the element in the Form Content
      | academicPeriod  |
      | academicPeriod2 |
      | gradeLevel      |
      | gradeLevel2     |
      | saveButton      |

    Then Success message should be displayed

    And Click on the element in the left Nav
      | entranceExamsOne |
      | setupTree        |
      | entranceExamsTwo |

    When User delete the  "recepExam18" from Form
    Then Success message should be displayed