package bb.steps;

import bb.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HomeSteps extends ScenarioSteps {
    HomePage homePage;

    @Step
    public void verifyLoginSuccessfully(){
        assertThat(homePage.verifyLoginSuccessfully()).isTrue();
    }

    @Step
    public void skipPopup(){
        homePage.skipPopup();
    }

    @Step
    public void clickOnMoneyTransfer(){
        homePage.clickOnMoneyTransfer();
    }

}

