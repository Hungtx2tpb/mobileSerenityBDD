package bb.defs;

import bb.steps.ProductSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class ProductDefs {
    @Steps
    ProductSteps productSteps;

    @Given("^user chon mua san pham$")
    public void clickMua() {
        productSteps.clickMua();
    }

    @Given("^user chon mua san pham sau khi chon so luong$")
    public void clickMuaSauKhiChonSoLuong() {
        productSteps.clickMuaSauKhiChonSoLuong();
    }

    @Given("^user chon quay tro lai tren man san pham$")
    public void clickBack() {
        productSteps.clickBack();
    }

    @Given("^user lua chon so luong san pham muon mua (.*)$")
    public void luaChonSoLuongSanPham(int number) {
        productSteps.luaChonSoLuongSanPham(number);
    }

}
