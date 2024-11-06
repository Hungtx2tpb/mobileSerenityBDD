package bb.defs;

import bb.steps.LoginSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginDefs {
    @Steps
    LoginSteps loginSteps;


    @Given("^user opens app$")
    public void userOpen() {
        loginSteps.startApplication();
    }

}
