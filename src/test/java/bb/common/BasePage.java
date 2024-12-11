package bb.common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class BasePage extends PageObject {

    private Dimension screenSize;
    private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

    public void closeAppThenReopen() {
        mobileDriver().launchApp();
    }

    public void closeAppThenReopenIOS() {
        mobileDriverIOS().closeApp();
        waitABit(5000);
        mobileDriverIOS().launchApp();
    }

    public void waitASeconds(int miliseconds) {
        waitABit(miliseconds);
    }

    public void enterValueToNumberKeyBoardIOS(String number) {
        for (int i = 0; i < number.length(); i++) {
            String no = String.valueOf(number.charAt(i));
            getDriver().findElement(By.id(no)).click();
        }
    }


    public static String changeCurrencyFormatVND(String balance) {
        double balanceDouble = Double.parseDouble(balance);
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(balanceDouble);
    }

    // Sử dụng cho trường hợp excuitest version > 7.24
    public AppiumDriver getAndroidDriver() {
        return (AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    // Sử dụng cho trường hợp excuitest version > 7.24
    public AppiumDriver getIOSDriver() {
        return (IOSDriver) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    public AppiumDriver<AndroidElement> mobileDriver() {
        return (AppiumDriver<AndroidElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    public AppiumDriver<IOSElement> mobileDriverIOS() {
        return (AppiumDriver<IOSElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    public void scrollDownByAction() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 2, (deviceHeight / 2) - 100))
                .moveTo(PointOption.point(deviceWidth / 2, 0))
                .release()
                .perform();
    }

    public void scrollDownByActionCustomIos() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 12, (deviceHeight / 2) - 50))
                .moveTo(PointOption.point(deviceWidth / 12, 0))
                .release()
                .perform();
    }

    public void scrollDownByActionMoreThanHalf() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 2, (deviceHeight / 2) + 400))
                .moveTo(PointOption.point(deviceWidth / 2, 0))
                .release()
                .perform();
    }

    public void scrollDownByActionOneThirdScreen() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 3, (deviceHeight / 3) - 100))
                .moveTo(PointOption.point(deviceWidth / 3, 0))
                .release()
                .perform();
    }

    public void scrollDownByActionOneFourthScreen() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 4, (deviceHeight / 4) - 100))
                .moveTo(PointOption.point(deviceWidth / 4, 0))
                .release()
                .perform();
    }

    public void hideKeyboard() {
        try {
            mobileDriver().hideKeyboard();
        } catch (Exception e) {
            logger.error("Error while hiding keyboard", e);
        }
    }

    public void scrollDownByAction(int startX, int startY, int endX, int endY) {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();
        try {
            if (startX > deviceWidth || startY > deviceHeight || endX > deviceWidth || endY > deviceHeight)
                throw new Exception("PointOption is wrong");
        } catch (Exception e) {
            e.printStackTrace();
        }
        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(startX, startY))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    public void scrollUpToClosePopup() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 2, deviceHeight / 4))
                .moveTo(PointOption.point(deviceWidth / 2, deviceHeight - 10))
                .release()
                .perform();
    }

    public void scrollUpOneFourthScreen() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 2, deviceHeight / 4))
                .moveTo(PointOption.point(deviceWidth / 2, deviceHeight / 2))
                .release()
                .perform();
    }


    public void tapOnElementByAction(WebElement e) {
        TouchAction touchAction = new TouchAction(mobileDriver());
        touchAction.tap(TapOptions.tapOptions()
                        .withElement(ElementOption.element(e)))
                .perform();

    }

    public void holdOnElement(WebElement e) {
        Point p = e.getLocation();
        TouchAction touchAction = new TouchAction(mobileDriver());
        touchAction.press(PointOption.point(p.getX(), p.getY()))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                .release()
                .perform();
    }

    public boolean checkIfElementIsPresent(String xpath) {
        boolean isDisplay = false;
        try {
            if (getDriver().findElement(By.xpath(xpath)).isDisplayed()) {
                isDisplay = true;
            }
        } catch (Exception e) {
            isDisplay = false;
        }
        return isDisplay;

    }

    public void waitUntilElementInvisibleByXpath(int timeoutInSeconds, String xpath) {
        FluentWait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.of(timeoutInSeconds, ChronoUnit.SECONDS))
                .pollingEvery(Duration.of(50, ChronoUnit.MILLIS));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
    }

    public void waitUntilElementVisibleByXpath(String xpath) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf($(xpath)));
    }


    public void tabOnCoordinate(int x, int y) {
        TouchAction touchAction = new TouchAction(mobileDriver());
        touchAction.tap(PointOption.point(x, y)).perform();
    }

    public void tabOnCoordinateIOS(int x, int y) {
        TouchAction touchAction = new TouchAction(mobileDriverIOS());
        touchAction.tap(PointOption.point(x, y)).perform();
    }

    public void logPressOnCoordinate(int x, int y) {
        TouchAction touchAction = new TouchAction(mobileDriver());
        touchAction.longPress(PointOption.point(x, y)).perform();
    }

    public void tabOnPercentLocation(double xPercent, double yPercent) {
        int heightOfScreen = mobileDriver().manage().window().getSize().getHeight();
        int widthOfScreen = mobileDriver().manage().window().getSize().getWidth();
        TouchAction touchAction = new TouchAction(mobileDriver());
        touchAction
                .tap(PointOption.point((int) (widthOfScreen * xPercent / 100), (int) (heightOfScreen * yPercent / 100)))
                .perform();
    }

    public void waitUntilElementInvisible(int timeoutInSeconds, WebElementFacade e) {
        try {
            FluentWait<WebDriver> wait = new FluentWait<>(getDriver())
                    .withTimeout(Duration.of(timeoutInSeconds, ChronoUnit.SECONDS))
                    .pollingEvery(Duration.of(50, ChronoUnit.MILLIS));

            wait.until((ExpectedCondition<Boolean>) d -> {
                try {
                    return !e.isVisible();
                } catch (Exception exception) {
                    return false;
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void waitUntilElementInvisibleById(String id) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
    }

    public void waitUntilElementVisible(int timeoutInSeconds, WebElementFacade e) {
        try {
            FluentWait<WebDriver> wait = new FluentWait<>(getDriver())
                    .withTimeout(Duration.of(timeoutInSeconds, ChronoUnit.SECONDS))
                    .pollingEvery(Duration.of(50, ChronoUnit.MILLIS));

            wait.until((ExpectedCondition<Boolean>) d -> {
                try {
                    return e.isVisible();
                } catch (Exception exception) {
                    return false;
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public boolean waitUntilElementEnable(int timeoutInSeconds, WebElementFacade e) {
        try {
            FluentWait<WebDriver> wait = new FluentWait<>(getDriver())
                    .withTimeout(Duration.of(timeoutInSeconds, ChronoUnit.SECONDS))
                    .pollingEvery(Duration.of(50, ChronoUnit.MILLIS));

            wait.until((ExpectedCondition<Boolean>) d -> {
                try {
                    return e.isEnabled();
                } catch (Exception exception) {
                    return false;
                }
            });
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public void enterPasscodeAndroid(String number) {
        char[] arr = number.toCharArray();
        Character[] arrNum = ArrayUtils.toObject(arr);
        for (int i = 0; i < arrNum.length; i++) {
            mobileDriver().getKeyboard().pressKey(numpad(arrNum[i]));
        }
    }

    public void enterPasscodeByIdAndroid(String number) {
        for (int i = 0; i < number.length(); i++) {
            String no = String.valueOf(number.charAt(i));
            String id = String.format("authenticationJourney_passcodeKeyboard_%sButton", no);
            $(By.id(id)).waitUntilClickable().click();
        }
    }

    private Keys numpad(Character c) {
        Keys numpad = null;
        switch (c) {
            case '0':
                numpad = Keys.NUMPAD0;
                break;
            case '1':
                numpad = Keys.NUMPAD1;
                break;
            case '2':
                numpad = Keys.NUMPAD2;
                break;
            case '3':
                numpad = Keys.NUMPAD3;
                break;
            case '4':
                numpad = Keys.NUMPAD4;
                break;
            case '5':
                numpad = Keys.NUMPAD5;
                break;
            case '6':
                numpad = Keys.NUMPAD6;
                break;
            case '7':
                numpad = Keys.NUMPAD7;
                break;
            case '8':
                numpad = Keys.NUMPAD8;
                break;
            case '9':
                numpad = Keys.NUMPAD9;
                break;
            default:
        }
        return numpad;
    }


    public String formatNumber(String s) {       //return only number
        return s.replaceAll("[^0-9]+", "");
    }

    public void waitUntilElementPresent(int timeoutInSeconds, String x) {
        FluentWait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.of(timeoutInSeconds, ChronoUnit.SECONDS))
                .pollingEvery(Duration.of(50, ChronoUnit.MILLIS));

        wait.until((ExpectedCondition<Boolean>) d -> {
            try {
                return findAll(x).size() > 0;
            } catch (Exception exception) {
                return false;
            }
        });
    }


    public void scrollUpByAction() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 2, deviceHeight / 4))
                .moveTo(PointOption.point(deviceWidth / 2, deviceHeight / 2))
                .release()
                .perform();
    }

    public List<String> getTextListElement(By by) {
        List<WebElementFacade> listElement = findAll(by);
        List<String> listText = new ArrayList<>();
        for (WebElementFacade e : listElement) {
            listText.add(e.getText());
        }
        return listText;
    }

    public List<String> getTextListElementFormatXpath(String xpathNeedFormat, List<String> listStringFormat) {
        List<String> listText = new ArrayList<>();
        for (String s : listStringFormat) {
            String text = $(String.format(xpathNeedFormat, s)).getText();
            listText.add(text);
        }
        return listText;
    }

    public static String changeAccountNumberFormat(String s) {
        String val = "4";
        return s.replaceAll("(.{" + val + "})", "$1 ").trim();
    }

    public void scrollDownByActionAndroid() {
        if (screenSize == null) {
            screenSize = getDriver().manage().window().getSize();
        }
        int deviceHeight = screenSize.getHeight();
        int deviceWidth = screenSize.getWidth();

        TouchAction action = new TouchAction(mobileDriver());
        action.longPress(PointOption.point(deviceWidth / 2, 3 * deviceHeight / 4))
                .moveTo(PointOption.point(deviceWidth / 2, 0))
                .release()
                .perform();
    }

    public void waitUntilElementEnable(String x) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(x)));
    }

    public void waitElementEnable(int timeoutInSeconds, WebElementFacade e) {
        FluentWait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.of(timeoutInSeconds, ChronoUnit.SECONDS))
                .pollingEvery(Duration.of(50, ChronoUnit.MILLIS));

        wait.until((ExpectedCondition<Boolean>) d -> {
            try {
                return e.isEnabled();
            } catch (Exception exception) {
                return false;
            }
        });
    }

    public String getLastMonth(String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        return simpleDateFormat.format(cal.getTime());
    }

    public String getCurrentMonth(String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 0);
        return simpleDateFormat.format(cal.getTime());
    }

    public void swipeToLeft(int x, int y) {
        int heightOfScreen = mobileDriver().manage().window().getSize().getHeight();
        int widthOfScreen = mobileDriver().manage().window().getSize().getWidth();
        TouchAction swipe = new TouchAction(mobileDriver())
                .press(PointOption.point(x, y))
                .waitAction(waitOptions((ofMillis(300))))
                .moveTo(PointOption.point(0, y))
                .release()
                .perform();
    }

    public void swipeToRight(int x, int y) {
        TouchAction swipe = new TouchAction(mobileDriver())
                .press(PointOption.point(0, y))
                .waitAction(waitOptions((ofMillis(300))))
                .moveTo(PointOption.point(x, y))
                .release()
                .perform();
    }

    public void swipeFromLocationToLocation(int fromX, int fromY, int toX, int toY) {
        TouchAction swipe = new TouchAction(mobileDriver())
                .press(PointOption.point(fromX, fromY))
                .waitAction(waitOptions((ofMillis(300))))
                .moveTo(PointOption.point(toX, toY))
                .release()
                .perform();
    }

    public void waitUntilTextDisplayed(WebElementFacade e) {
        try {
            (new WebDriverWait(getDriver(), 60)).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    return e.getText().length() != 0;
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void waitUntilExpectedTextDisplayed(WebElementFacade e, String text) {
        try {
            (new WebDriverWait(getDriver(), 60)).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    return e.getText().contains(text);
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void scrollDownToElementById(int index, String account) {
        int i = 0;
        while (!$(By.id(account)).isCurrentlyVisible() && i < index) {
            scrollDownByAction();
            i++;
        }
    }

    public void scrollDownToElementByXpath(int index, String xpath) {
        int i = 0;
        while (!$(xpath).isCurrentlyVisible() && i < index) {
            scrollDownByAction();
            i++;
        }
    }

    public void scrollToElementIOS(int index, @NotNull WebElementFacade e) {
        int i = 0;
        while ((!e.isDisplayed()) && (i < index)) {
            scrollDownByActionCustomIos();
            i++;
        }
    }

    public void scrollDownByActionMoreThanHalf(int index, String xpath) {
        int i = 0;
        while (!$(xpath).isCurrentlyVisible() && i < index) {
            scrollDownByActionMoreThanHalf();
            i++;
        }
    }

    public void scrollDownToWebElementFacade(int index, WebElementFacade e) {
        int i = 0;
        while (!e.isCurrentlyVisible() && i < index) {
            scrollDownByAction();
            i++;
        }
    }

    public void scrollDownToWebElementFacadeOneFourthScreen(int index, WebElementFacade e) {
        int i = 0;
        while (!e.isCurrentlyVisible() && i < index) {
            scrollDownByActionOneFourthScreen();
            i++;
        }
    }

    public void scrollUpToWebElementFacade(int index, WebElementFacade e) {
        int i = 0;
        while (!e.isCurrentlyVisible() && i < index) {
            scrollUpByAction();
            i++;
        }
    }

    public static String formatBlankSpace(String s) {
        return s.replaceAll("[ \\s+]", "");
    }

}
