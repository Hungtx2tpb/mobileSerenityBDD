package bb.steps;

import bb.pages.AuthenticationCodePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AuthenticationCodeSteps extends ScenarioSteps {

    AuthenticationCodePage authCodePage;

    @Step
    public void inputOTPandClickAuthenticate(){
        authCodePage.inputOTPandClickAuthenticate();
    }
}
