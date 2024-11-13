package bb.pages;

import bb.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Đơn hàng từng mua')]")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade lblDonHangTungMua;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='tab_Cart']")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnGioHang;

    @AndroidFindBy(id = "cpp_button_subtraction")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade op_sub;

    @AndroidFindBy(id = "cpp_button_plus")
//    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"cộng\"]")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade op_add;

    @AndroidFindBy(id = "eq")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade eq;

    @AndroidFindBy(id = "calculator_display")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade result;

    @AndroidFindBy(id = "cpp_button_clear")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade clear;

    @AndroidFindBy(id = "calculator_editor")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade formula;


    public void clickDonHangTungMua() {
        lblDonHangTungMua.waitUntilClickable().click();
    }

    public void clickButtonGioHang() {
        btnGioHang.waitUntilClickable().click();
    }

    public void tapVaoTimKiemTheoToaDo() {
        waitASeconds(3000);
        waitUntilElementVisible(15, lblDonHangTungMua);
        tabOnCoordinate(200, 320);
    }
}
