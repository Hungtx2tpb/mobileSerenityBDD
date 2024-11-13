package bb.pages;

import bb.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "btnClose")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Close']")
    WebElementFacade btnClose;


}
