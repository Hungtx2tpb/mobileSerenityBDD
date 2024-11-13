package bb.steps;

import bb.pages.CartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class CartSteps extends ScenarioSteps {
    CartPage cartPage;

    @Step
    public void clickXoaSanPham() {
        cartPage.clickXoaSanPham();
    }

    @Step
    public void clickXacNhanXoaSanPham() {
        cartPage.clickXacNhanXoaSanPham();
    }

    @Step
    public void clickHuyXoaSanPham() {
        cartPage.clickHuyXoaSanPham();
    }

    @Step
    public void verifyGioHangSauKhiXoaSanPham() {
        assertThat(true).isEqualTo(cartPage.verifyGioHangSauKhiXoaSanPham());
    }

    @Step
    public void verifyGioHang() {
        assertThat(true).isEqualTo(cartPage.verifyGioHang());
    }


}

