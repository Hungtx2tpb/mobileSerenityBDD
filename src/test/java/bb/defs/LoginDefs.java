package bb.defs;

import bb.steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefs {
    @Steps
    LoginSteps loginSteps;


    @Given("^user opens Ebank app$")
    public void userOpen() {
        loginSteps.startApplication();
    }

    @When("user login Ebank with with role \"([^\"]*)\"")
    public void userLoginEbank(String typeOfRole) {
        loginSteps.LoginEbank(typeOfRole);
    }


}
