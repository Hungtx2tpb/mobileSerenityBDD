package bb.steps;

import bb.pages.MoneyTransferPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MoneyTransferSteps extends ScenarioSteps {
    MoneyTransferPage moneyTransferPage;

    @Step
    public void inputAccountNumberOrPhone(String account){
        moneyTransferPage.inputAccountNumberOrPhone(account);
    }

    @Step
    public void clickOnConfirm(){
        moneyTransferPage.clickOnConfirm();
    }

    @Step
    public void inputAmount(String amount){
        moneyTransferPage.inputAmount(amount);
    }

    @Step
    public void inputMessage(String message){
        moneyTransferPage.inputMessage(message);
    }

    @Step
    public void waitForReciverNameDisplayed(){
        moneyTransferPage.waitForReciverNameDisplayed();
    }

    @Step
    public void createTransferInTPB(String account, String amount, String message){
        this.inputAccountNumberOrPhone(account);
        this.waitForReciverNameDisplayed();
        this.inputAmount(amount);
        moneyTransferPage.hideKeyboard();
        this.inputMessage(message);
        moneyTransferPage.hideKeyboard();
        moneyTransferPage.clickOnContinue();
        this.clickOnConfirm();

    }
}
