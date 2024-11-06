@ANDROID
Feature: Don hang tung mua - android

  Background: Device opens app on Android
    Given user opens app

  @tcName
  Scenario: Kiem tra bat buoc nhap dien thoai trong don hang tung mua
    When user clear cache
    When user input number: "9"
    And user choose operator: "+"
    And user input number: "9"
    Then user verify result after calculated "18"
