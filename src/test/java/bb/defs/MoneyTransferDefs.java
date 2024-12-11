package bb.defs;

import bb.steps.MoneyTransferSteps;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MoneyTransferDefs {
    @Steps
    MoneyTransferSteps transferSteps;

    @When("user create transfer in TPB with account \"([^\"]*)\" and amount \"([^\"]*)\" and message \"([^\"]*)\"")
    public void userCreateTransferInTPB(String account, String amount, String message){
        transferSteps.createTransferInTPB(account, amount, message);
    }
}
