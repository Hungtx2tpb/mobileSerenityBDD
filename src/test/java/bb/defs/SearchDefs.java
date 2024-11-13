package bb.defs;

import bb.steps.SearchSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class SearchDefs {
    @Steps
    SearchSteps searchSteps;

    @Given("^user nhap san pham tim kiem \"([^\"]*)\"")
    public void timKiemSanPham(String value) {
        searchSteps.timKiemSanPham(value);
    }
    @Given("^user bam tro lai tren man tim kiem san pham")
    public void clickBackSearchPage() {
        searchSteps.clickBackSearchPage();
    }

    @Given("^user chon san pham sau tim kiem \"([^\"]*)\"")
    public void luaChonSanPham(String value) {
        searchSteps.luaChonSanPham(value);
    }

}
