package bb.pages;
import bb.common.BasePage;
import bb.utils.Constant;
import bb.utils.DataUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.HashMap;

public class LoginPage extends BasePage {

    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'btnLogin') or contains(@resource-id, 'btnLoginBlur')]")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnLogin;

    @AndroidFindBy(xpath = "//*[@resource-id = 'tpb.bb.hydrobank:id/btn_skip']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnSkip;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'btn_login_first')]")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnLoginFirst;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'permission_allow_button')]")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnAllow;

    @AndroidFindBy(xpath = "//*[@resource-id = 'tpb.bb.hydrobank:id/etUsername']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtUserName;

    @AndroidFindBy(xpath = "//*[@resource-id = 'tpb.bb.hydrobank:id/etPassword']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtPassWord;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, 'defaultLoginLogo')]")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade imgLoginLogo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'UAT']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade btnUAT;


    @AndroidFindBy(xpath = "//*[@resource-id='tpb.bb.hydrobank:id/edt_otp_auth_dialog']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtInputOTP;

    public void startApplication() {
        btnSkip.waitUntilClickable().click();
        btnAllow.waitUntilClickable().click();
    }

    public void inputUserNameField(String username) {
        txtUserName.waitUntilVisible().sendKeys(username);
    }

    public void inputPassWordField(String password) {
        txtPassWord.waitUntilVisible().sendKeys(password);
    }

    public void clickOnLoginButton() {
        btnLogin.waitUntilClickable().click();
    }

    public void clickOnLoginFirstButton() {
        btnLoginFirst.waitUntilClickable().click();
    }

    public void selectUATEnv() {
        imgLoginLogo.waitUntilClickable().click();
        btnUAT.waitUntilClickable().click();
    }

    public void inputUsernameAndPassword(String typeOfRole){
        String absolutePath = System.getProperty("user.dir") + Constant.RELATIVEPATH;
        HashMap<String, String> infoUser = DataUtils.getCredentialsByRole(absolutePath, typeOfRole);
        String username = infoUser.get("username");
        String password = infoUser.get("password");
        Serenity.setSessionVariable("username").to(username);
        Serenity.setSessionVariable("password").to(password);
        this.inputUserNameField(username);
        this.inputPassWordField(password);
    }

}
