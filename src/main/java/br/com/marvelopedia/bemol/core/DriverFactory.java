package br.com.marvelopedia.bemol.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {


    public static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver() {
        if(driver == null) {
            createDriver();
        } return driver;

    }

    public static void createDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "emulator");
        desiredCapabilities.setCapability("appium:automationName", "uiautomator2");


        //Utiliza o path relativo pra buscar o apk dentro da pastar Resources
        String userDir = System.getProperty("user.dir");
        String apkPath = userDir + "/src/main/resources/marvelopedia.apk";
        desiredCapabilities.setCapability(MobileCapabilityType.APP, apkPath);


        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);


        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        //Inicializa comunicação com o Servidor
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public static void killDriver( ) {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }



}
