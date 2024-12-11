package bb.defs;

import bb.steps.HomeSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class HomeDefs {
    @Steps
    HomeSteps homeSteps;

    @Then("^verify user login Ebank successfully$")
    public void verifyLoginSuccessfully() {
        homeSteps.verifyLoginSuccessfully();
    }

    @When("^user perform skip popup$")
    public void userSkipPopup(){
        homeSteps.skipPopup();
    }

    @When("^user click on Money Transfer$")
    public void userClickOnMoneyTransfer(){
        homeSteps.clickOnMoneyTransfer();
    }


}
