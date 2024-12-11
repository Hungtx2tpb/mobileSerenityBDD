package bb.pages;

import bb.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MoneyTransferPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text = 'Số tài khoản hoặc số điện thoại']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtAccountNumberOrPhone;

    @AndroidFindBy(xpath = "//*[@text = 'Số tài khoản hoặc số điện thoại']/following-sibling::android.widget.LinearLayout/child::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtInputAccountNumberOrPhone;

    @AndroidFindBy(xpath = "//*[@text = 'Số tiền']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtAmount;

    @AndroidFindBy(xpath = "//*[@text = 'Số tiền']/following-sibling::android.widget.LinearLayout/child::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtInputAmount;

    @AndroidFindBy(xpath = "//*[@text = 'Nội dung chuyển tiền']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtMessage;

    @AndroidFindBy(xpath = "//*[@text = 'Nội dung chuyển tiền']/following-sibling::android.widget.LinearLayout/child::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtInputMessage;

    @AndroidFindBy(xpath = "//*[@text = 'Tên người nhận']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtReciverName;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='tpb.bb.hydrobank:id/btn_next']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnContinue;

    @AndroidFindBy(xpath = "//*[@text = 'XÁC NHẬN' or @content-desc = 'Xác Nhận']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnConfirm;

    public void inputAccountNumberOrPhone(String account){
        txtAccountNumberOrPhone.waitUntilClickable().click();
        txtInputAccountNumberOrPhone.waitUntilVisible().sendKeys(account);
    }

    public void inputAmount(String amount){
        txtAmount.waitUntilClickable().click();
        txtInputAmount.waitUntilVisible().sendKeys(amount);
    }

    public void inputMessage(String message){
        txtMessage.waitUntilClickable().click();
        txtInputMessage.waitUntilVisible().clear();
        txtInputMessage.waitUntilVisible().sendKeys(message);
    }

    public void waitForReciverNameDisplayed(){
        txtAmount.waitUntilClickable().click();
        waitUntilElementVisible(30, txtReciverName);
    }

    public void clickOnContinue(){
        btnContinue.waitUntilClickable().click();
    }

    public void clickOnConfirm(){
        btnConfirm.waitUntilClickable().click();
    }
}
