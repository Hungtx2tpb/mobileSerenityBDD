@ANDROID @All
Feature: Testcase common money transfer in TPB

  Background: Device opens app on Android
    Given user opens Ebank app

  @TC_2
  Scenario: Kiem tra luong chuyen tien noi bo stk la sdt
    When user login Ebank with with role "user money transfer 2"
    And user perform skip popup
    Then verify user login Ebank successfully
    When user click on Money Transfer
    And user create transfer in TPB with account "38388188888" and amount "10000" and message "hungtx123"
    And user input OTP and click on Authenticate