@ANDROID @REGRESSION @BIll_PAYMENTS @test
Feature: Calculator app - android

  Background: Device opens app on Android
    Given user opens app

  @tcName
  Scenario: Verify Calculator successfully
    Given user send api get token
      | Key      | Value     |
      | userName | demo      |
      | password | Demo@2024 |
    Then user verify API response code display equals 200
    When user clear cache
    When user input number: "9"
    And user choose operator: "+"
    And user input number: "9"
    Then user verify result after calculated "18"
