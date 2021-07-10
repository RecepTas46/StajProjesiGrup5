Feature: Citizenship with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship page

  Scenario Outline: Citizenship create and delete with scenario Outline
    When User a Ctizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Success message should be displayed

    #negativ test icin ,yani error test icin yaptik
    When User a Ctizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Already exist message should be displayed
    And  Click on close button

    When User delete the  "<CitizenshipName>"
    Then Success message should be displayed


    Examples:
      | CitizenshipName | ShortName |
      | recep33         | tr31      |
      | radish33        | rg31      |
      | mertish3123     | is31      |
      | krikish413      | tr41      |
