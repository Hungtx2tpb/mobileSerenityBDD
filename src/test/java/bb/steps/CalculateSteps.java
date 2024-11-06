package bb.steps;

import bb.pages.CalculatePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateSteps extends ScenarioSteps {
    CalculatePage calculatePage;

    @Step
    public void clearCache() {
        calculatePage.clearCache();
    }

    @Step
    public void enterNumberIntoField(String number) {
        calculatePage.enterNumberIntoField(number);
    }

    @Step
    public void userChooseOperator(String op) {
        calculatePage.userChooseOperator(op);
    }

    @Step
    public void userVerifyResultAfterCalculated(String value) {
        assertThat(value).isEqualTo(calculatePage.getResult());
    }

}

