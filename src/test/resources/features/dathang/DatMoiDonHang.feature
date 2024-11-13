@ANDROID
Feature: Dat moi don hang - android

  Background: Device opens app on Android
    Given user opens app

  @tcName @order-new
  Scenario Outline: Kiem tra dat don hang moi thanh cong va them moi vao gio hang
    When user click tim kiem
    And user nhap san pham tim kiem "<value>"
    And user chon san pham sau tim kiem "<value>"
    When user chon mua san pham
    And user lua chon so luong san pham muon mua <number>
    And user chon mua san pham sau khi chon so luong
    When user chon quay tro lai tren man san pham
    And user bam tro lai tren man tim kiem san pham
    When user click gio hang
    And user click xoa san pham
    And user click huy xoa san pham
    Then user verify gio hang
    And user click xoa san pham
    When user click xac nhan xoa san pham
    When user click gio hang
    When user verify gio hang sau khi xoa san pham
    Examples:
      | value    | number |
      | hazeline | 3      |
