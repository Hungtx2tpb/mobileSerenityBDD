package bb.pages;

import bb.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CalculatePage extends BasePage {

    @AndroidFindBy(id = "cpp_button_division")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade op_div;

    @AndroidFindBy(id = "cpp_button_multiplication")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade op_mul;

    @AndroidFindBy(id = "cpp_button_subtraction")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade op_sub;

    @AndroidFindBy(id = "cpp_button_plus")
//    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"cộng\"]")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade op_add;

    @AndroidFindBy(id = "eq")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade eq;

    @AndroidFindBy(id = "calculator_display")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade result;

    @AndroidFindBy(id = "cpp_button_clear")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade clear;

    @AndroidFindBy(id = "calculator_editor")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade formula;


    public void clearCache() {
        clear.waitUntilClickable().click();
    }

    public void enterNumberIntoField(String number) {
        formula.sendKeys(number);
    }

    public void userChooseOperator(String op) {
        switch (op) {
            case "+":
                op_add.waitUntilClickable().click();
                break;
            case "-":
                op_sub.waitUntilClickable().click();
                break;
            case "x":
                op_mul.waitUntilClickable().click();
                break;
            case ":":
                op_div.waitUntilClickable().click();
                break;
            case "=":
                eq.waitUntilClickable().click();
                break;
        }
    }

    public String getResult() {
        return result.waitUntilVisible().getText();
    }

}
