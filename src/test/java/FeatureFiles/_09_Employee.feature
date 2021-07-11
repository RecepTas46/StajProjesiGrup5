Feature: Employee Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:Create Employee
    And Click on the element in the left Nav
      | humanResources |
      | Employees      |
    And Click on the element in the Dialog
      | addButton |
    When User sending the keys in form content
      | inputEmployeeName     | recep00 |
      | inputEmployeeLastName | ttt001  |
      | employeeId            | 158541  |
      | documentNumber        | 11243   |

    And Click on the element in the Form Content
      | gender          |
      | male            |
      | documentType    |
      | passport        |
      | employeeType    |
      | employeeTeacher |
      | saveButton      |

    Then Success message should be displayed


    And Click on the element in the left Nav
      | humanResources |
      | Employees      |

    When User delete the  "recep00" from Form
    Then Success message should be displayed
