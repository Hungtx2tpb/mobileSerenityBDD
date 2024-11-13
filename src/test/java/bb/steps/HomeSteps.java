package bb.steps;

import bb.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeSteps extends ScenarioSteps {
    HomePage homePage;

    @Step
    public void clickDonHangTungMua() {
        homePage.clickDonHangTungMua();
    }

    @Step
    public void clickButtonGioHang() {
        homePage.clickButtonGioHang();
    }

    @Step
    public void tapVaoTimKiemTheoToaDo() {
        homePage.tapVaoTimKiemTheoToaDo();
    }


}

