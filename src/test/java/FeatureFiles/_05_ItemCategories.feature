Feature: Item Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline:
    And Navigate to Item Category page
    When User create a item categories as "<InvertoryItemName>" short as "<UserTypeOption>"
    Then Success message should be displayed
    When User delete the "<InvertoryItemName>"
    Then Success message should be displayed

    Examples:
      | InvertoryItemName | UserTypeOption |
      | Laptop101           | Manager        |
      | Projector102       | Student        |
      | Whiteboard103      | Teacher        |
