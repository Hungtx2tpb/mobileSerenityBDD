package bb.defs;

import bb.steps.HomeSteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomeDefs {
    @Steps
    HomeSteps homeSteps;

    @Given("^user click tim kiem$")
    public void tapVaoTimKiemTheoToaDo() {
        homeSteps.tapVaoTimKiemTheoToaDo();
    }

    @Given("^user click vao don hang tung mua")
    public void clickDonHangTungMua() {
        homeSteps.clickDonHangTungMua();
    }
    @Given("^user click gio hang")
    public void clickButtonGioHang() {
        homeSteps.clickButtonGioHang();
    }

}
