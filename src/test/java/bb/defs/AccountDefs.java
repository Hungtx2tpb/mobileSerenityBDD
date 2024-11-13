package bb.defs;

import bb.steps.AccountSteps;
import bb.steps.HomeSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class AccountDefs {
    @Steps
    AccountSteps accountSteps;

    @Given("^user kiem tra message loi \"([^\"]*)\"$")
    public void userVerifyErrorMessage(String value) {
        accountSteps.userVerifyErrorMessage(value);
    }

    @Given("^user click button tiep tuc")
    public void clickButtonTiepTuc() {
        accountSteps.clickButtonTiepTuc();
    }

}
