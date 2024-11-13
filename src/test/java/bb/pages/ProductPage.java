package bb.pages;

import bb.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[contains(@content-desc,'MUA')])[1]")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade buy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Số lượng']/following-sibling::android.view.ViewGroup[1]//android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnAdd;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Số lượng']/following-sibling::android.view.ViewGroup[1]//android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnSub;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Số lượng']/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnMua;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='btn_back']")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnBack;

    public void clickMua() {
        buy.waitUntilClickable().click();
    }
    public void clickBack() {
        btnBack.waitUntilClickable().click();
    }

    public void clickMuaSauKhiChonSoLuong() {
        btnMua.waitUntilClickable().click();
    }

    public void luaChonSoLuongSanPham(int number) {
        for (int i = 1; i < number; i++) {
            btnAdd.waitUntilClickable().click();
        }
    }


}
