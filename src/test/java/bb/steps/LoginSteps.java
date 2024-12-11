package bb.steps;

import bb.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps extends ScenarioSteps {
    private static final Logger log = LoggerFactory.getLogger(LoginSteps.class);
    LoginPage loginPage;

    @Step
    public void startApplication() {
        loginPage.startApplication();
    }

    @Step
    public void inputUserNameField(String username) {
        loginPage.inputUserNameField(username);
    }

    @Step
    public void inputPassWordField(String password) {
        loginPage.inputPassWordField(password);
    }

    @Step
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }

    @Step
    public void clickOnLoginFirstButton(){
        loginPage.clickOnLoginFirstButton();
    }

    @Step
    public void selectUATEnv(){
        loginPage.selectUATEnv();
    }

    @Step
    public void LoginEbank(String typeOfRole){
        this.selectUATEnv();
        this.clickOnLoginFirstButton();
        loginPage.inputUsernameAndPassword(typeOfRole);
        this.clickOnLoginButton();
    }





}

