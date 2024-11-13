package bb.pages;

import bb.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"header_txt_textinput_search\"]")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade txtSearch;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='btn_back']")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnBackSearchPage;

    public void timKiemSanPham(String value) {
        waitASeconds(5000);
        txtSearch.sendKeys(value);
    }

    public void luaChonSanPham(String value) {
        String xpath = "//android.view.ViewGroup[@content-desc='" + value + "']";
        $(xpath).waitUntilClickable().click();
        waitASeconds(3000);
    }

    public void clickBackSearchPage() {
        btnBackSearchPage.waitUntilClickable().click();
    }
}
