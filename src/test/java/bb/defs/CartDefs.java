package bb.defs;

import bb.steps.CartSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class CartDefs {
    @Steps
    CartSteps cartSteps;

    @Given("^user click xoa san pham$")
    public void clickXoaSanPham() {
        cartSteps.clickXoaSanPham();
    }

    @Given("^user click xac nhan xoa san pham$")
    public void clickXacNhanXoaSanPham() {
        cartSteps.clickXacNhanXoaSanPham();
    }

    @Given("^user click huy xoa san pham$")
    public void clickHuyXoaSanPham() {
        cartSteps.clickHuyXoaSanPham();
    }

    @Given("^user verify gio hang sau khi xoa san pham$")
    public void verifyGioHangSauKhiXoaSanPham() {
        cartSteps.verifyGioHangSauKhiXoaSanPham();
    }
    @Given("^user verify gio hang$")
    public void verifyGioHang() {
        cartSteps.verifyGioHang();
    }


}
