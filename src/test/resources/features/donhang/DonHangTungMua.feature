@ANDROID
Feature: Don hang tung mua - android

  Background: Device opens app on Android
    Given user opens app

  @tcName-1
  Scenario: Kiem tra bat buoc nhap so dien thoai trong don hang tung mua
    When user click vao don hang tung mua
    And user click button tiep tuc
    When user kiem tra message loi "Số điện thoại không hợp lệ, vui lòng kiểm tra lại."
