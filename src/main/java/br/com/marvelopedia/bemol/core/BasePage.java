package br.com.marvelopedia.bemol.core;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

import static br.com.marvelopedia.bemol.core.DriverFactory.driver;
import static br.com.marvelopedia.bemol.core.DriverFactory.getDriver;

public class BasePage {

    public MobileElement findElementByHint(String hint) {
        return getDriver().findElement(MobileBy.xpath(hint));
    }
    public void sendKeyByHint(String xpath, String keysToSend) {
        MobileElement mobileElement = findElementByHint(xpath);
        mobileElement.click();
        mobileElement.sendKeys(keysToSend);
    }

    public MobileElement findElementByText(String text) {
        return getDriver().findElement(MobileBy.xpath(text));
    }

    public void waitLoadApp() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
