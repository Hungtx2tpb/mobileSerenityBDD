package bb.steps;

import bb.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductSteps extends ScenarioSteps {
    ProductPage productPage;

    @Step
    public void clickMua() {
        productPage.clickMua();
    }

    @Step
    public void clickMuaSauKhiChonSoLuong() {
        productPage.clickMuaSauKhiChonSoLuong();
    }

    @Step
    public void clickBack() {
        productPage.clickBack();
    }

    @Step
    public void luaChonSoLuongSanPham(int number) {
        productPage.luaChonSoLuongSanPham(number);
    }

}

