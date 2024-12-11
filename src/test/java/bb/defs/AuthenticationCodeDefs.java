package bb.defs;

import bb.steps.AuthenticationCodeSteps;
import bb.steps.MoneyTransferSteps;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AuthenticationCodeDefs {
    @Steps
    AuthenticationCodeSteps authCodeSteps;

    @When("^user input OTP and click on Authenticate$")
    public void userCreateTransferInTPB(){
        authCodeSteps.inputOTPandClickAuthenticate();
    }
}
