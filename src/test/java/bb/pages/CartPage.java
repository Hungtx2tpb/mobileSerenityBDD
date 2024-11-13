package bb.pages;

import bb.common.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends BasePage {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Xóa hết sản phẩm']")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnXoaSanPham;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Đồng ý']")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnXacNhanXoaSanPham;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Không xóa']")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnHuyXoaSanPham;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Tiếp tục mua hàng']")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade btnContinueOrder;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Hàng có sẵn\"]")
    @iOSXCUITFindBy(xpath = "TBD")
    WebElementFacade lblAlreadyOrder;


    public void clickXoaSanPham() {
        if (btnXoaSanPham.isPresent()) {
            btnXoaSanPham.waitUntilClickable().click();
        }
    }

    public void clickXacNhanXoaSanPham() {
        btnXacNhanXoaSanPham.waitUntilClickable().click();
    }

    public void clickHuyXoaSanPham() {
        btnHuyXoaSanPham.waitUntilClickable().click();
        waitASeconds(3000);
    }

    public boolean verifyGioHangSauKhiXoaSanPham() {
        return btnContinueOrder.isPresent();
    }

    public boolean verifyGioHang() {
        return lblAlreadyOrder.isPresent();
    }


}
