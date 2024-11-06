package bb.defs;

import bb.steps.CalculateSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class CalculateDefs {
    @Steps
    CalculateSteps calculateSteps;

    @Given("^user input number: \"([^\"]*)\"$")
    public void userInputNumber(String number) {
        calculateSteps.enterNumberIntoField(number);
    }

    @Given("^user choose operator: \"([^\"]*)\"$")
    public void userChooseOperator(String op) {
        calculateSteps.userChooseOperator(op);
    }

    @Given("^user verify result after calculated \"([^\"]*)\"$")
    public void userVerifyResultAfterCalculated(String value) {
        calculateSteps.userVerifyResultAfterCalculated(value);
    }

    @Given("^user clear cache")
    public void userClearCache() {
        calculateSteps.clearCache();
    }

}
