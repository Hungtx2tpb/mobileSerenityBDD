package bb.steps;

import bb.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {
    SearchPage searchPage;

    @Step
    public void timKiemSanPham(String value) {
        searchPage.timKiemSanPham(value);
    }

    @Step
    public void clickBackSearchPage() {
        searchPage.clickBackSearchPage();
    }

    @Step
    public void luaChonSanPham(String value) {
        searchPage.luaChonSanPham(value);
    }
}

