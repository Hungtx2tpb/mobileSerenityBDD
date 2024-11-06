package bb.steps;

import bb.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
    LoginPage loginPage;

    @Step
    public void startApplication() {
        loginPage.startApplication();
    }

}

