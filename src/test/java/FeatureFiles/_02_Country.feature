Feature: Country Functionality

  @SmokeTest
  Scenario: Create Country
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

    When Create a country
    Then Success message should be displayed