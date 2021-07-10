Feature: DataTable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  @RegressionTest
  Scenario:Create a Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | Countries  |

    And Click on the element in the Dialog
      | addButton |

    When  User sending the keys in dialog content
      | nameInput | recepCountry6 |
      | codeInput | 51233          |


    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed
  @RegressionTest
  Scenario:Create a Nationality
    #When Create a country name as "<RECEP>" code as "<OOO!>"
   # When Create a country name as "<RECEP>" code as "<OOO!>"
    #BILGI GONDERME "<....>" yaziyoruz(bunlarin yerine asagidaki gibi yapabiliriz)
#countries yerine citienShip yazarsak ona gider..
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    And Click on the element in the Dialog
      | addButton |

    When  User sending the keys in dialog content
      | nameInput | recepNationality |



    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed
  @RegressionTest
  Scenario:Create a Fees
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    When  User sending the keys in dialog content
      | nameInput       | recepFees1 |
      | codeInput       | 4343       |
      | integrationCode | 4343       |
      | priorityCode    | 7          |


    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed
#    Senaryo Outline da verilen değerler için tüm senaryo her satır kadar tekrar çalıştırılıyordu.
#    DataTable da ise, sadece ilgili step için toplu veri gönderme imkanı oluşuyor.