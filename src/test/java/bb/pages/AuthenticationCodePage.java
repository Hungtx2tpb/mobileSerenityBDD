package bb.pages;

import bb.common.BasePage;
import bb.data.OtpValue;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.Serenity;


public class AuthenticationCodePage extends BasePage {

    @AndroidFindBy(xpath = "//*[@resource-id='tpb.bb.hydrobank:id/edt_otp_auth_dialog']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtInputOTP;

    @AndroidFindBy(xpath = "//*[@text = 'XÁC THỰC']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnAuthenticate;

    public void inputOTPandClickAuthenticate() {
        String cif = Serenity.sessionVariableCalled("username");
//        String authCode = DatabaseUtils.getAuthCode(cif);
        String authCode = "hard_token_vas";
        switch (authCode){
            case "sms_otp":
                txtInputOTP.waitUntilVisible().sendKeys(OtpValue.SMS_OTP);
                break;
            case "etoken":
                txtInputOTP.waitUntilVisible().sendKeys(OtpValue.E_TOKEN);
                break;
            case "hard_token_vas":
//                txtInputOTP.waitUntilVisible().sendKeys(OtpValue.HARD_TOKEN);
                txtInputOTP.waitUntilVisible().sendKeys("111222");
                break;
        }
        btnAuthenticate.waitUntilClickable().click();
    }
}
