package bb.pages;

import bb.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends BasePage {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Tiếp tục']/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnTieptuc;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Tiếp tục']/preceding-sibling::android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade lblErrorMes;

    public void clickButtonTiepTuc() {
        btnTieptuc.waitUntilClickable().click();
    }


    public String getErrorMes() {
        return lblErrorMes.waitUntilVisible().getText();
    }

}
