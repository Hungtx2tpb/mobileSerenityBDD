package bb.pages;

import bb.common.BasePage;
import bb.utils.Utilities;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    @AndroidFindBy(xpath = "//*[@resource-id = 'tpb.bb.hydrobank:id/tv_username']")
    @iOSXCUITFindBy(xpath = "//...")
    WebElementFacade txtUsername;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='tpb.bb.hydrobank:id/btn_close']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnClose;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='tpb.bb.hydrobank:id/ic_close_popup']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnIcClose;

    @AndroidFindBy(xpath = "//*[@resource-id = 'tpb.bb.hydrobank:id/btnFundTransfer']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnMoneyTransfer;

    public boolean verifyLoginSuccessfully(){
        waitUntilElementVisible(50, txtUsername);
        return txtUsername.isDisplayed();
    }

    public void skipPopup(){
        if(btnClose.waitUntilVisible().isVisible()){
            btnClose.click();
        }
        if (btnIcClose.waitUntilVisible().isVisible()){
            btnIcClose.click();
        }
    }

    public void clickOnMoneyTransfer(){
        btnMoneyTransfer.waitUntilClickable().click();

    }






//  if(Utilities.isCurrentPlatformAndroid()){
//        String xpath = "//android.widget.ImageView[@resource-id='%s']";
//        String a = String.format(xpath,"a");
//        $(a).click();
//        mobileDriver().findElement(By.xpath(a)).click();
//    }else

}
