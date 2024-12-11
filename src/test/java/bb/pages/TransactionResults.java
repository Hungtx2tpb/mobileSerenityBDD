package bb.pages;

import bb.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TransactionResults extends BasePage {

    @AndroidFindBy(xpath = "//*[@resource-id = 'tpb.bb.hydrobank:id/txt_transfer_final_status']")
    @iOSXCUITFindBy(xpath = "")
    WebElementFacade txtFinalStatus;

    public String getFinalStatus(){
        String finalStatus = txtFinalStatus.waitUntilVisible().getText();
        return finalStatus;
    }

}
