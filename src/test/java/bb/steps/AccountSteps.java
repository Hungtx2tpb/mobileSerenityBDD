package bb.steps;

import bb.pages.AccountPage;
import bb.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountSteps extends ScenarioSteps {

    AccountPage accountPage;

    @Step
    public void clickButtonTiepTuc() {
        accountPage.clickButtonTiepTuc();
    }

    @Step
    public void userVerifyErrorMessage(String value) {
        assertThat(value).isEqualTo(accountPage.getErrorMes());
    }

}

