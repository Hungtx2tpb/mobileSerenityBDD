package bb.steps;

import bb.pages.ProductPage;
import bb.pages.SearchPage;
import net.thucydides.core.annotations.Step;

public class CommonSteps {
    ProductPage productPage;
    SearchPage searchPage;

    @Step
    public void clickMuaSauKhiChonSoLuong() {
        productPage.clickMuaSauKhiChonSoLuong();
        searchPage.clickBackSearchPage();
    }

}
