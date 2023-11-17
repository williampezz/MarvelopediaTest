package br.com.marvelopedia.bemol.test;

import br.com.marvelopedia.bemol.core.BasePage;
import br.com.marvelopedia.bemol.core.DriverFactory;
import br.com.marvelopedia.bemol.pages.LoginPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;


public class LoginTest extends BasePage {

    public AndroidDriver<MobileElement> driver;
    private LoginPage login = new LoginPage();

    @Before
    public void inicializaAppiumFlutter() throws MalformedURLException {
        driver = DriverFactory.getDriver();

    }


    @Test
    public void LoginValid() {
        login.waitLoadApp();
        login.insertEmail("williamteste@teste.com");
        login.insertPass("1234567");
        login.clickLogin();
        login.loginOk();
    }

    @Test
    public void LoginInvalid() {
        login.waitLoadApp();
        login.insertEmail("williamteste@teste.com");
        login.insertPass("senhainvalida");
        login.clickLogin();
        login.loginNok();
    }

    @Test
    public void LoginEmailInvalid() {
        login.waitLoadApp();
        login.insertEmail("williamtest");
        login.insertPass("1234567");
        login.clickLogin();
        login.loginNok();
    }

    @Test
    public void LoginEmpty() {
        login.waitLoadApp();
        login.insertEmail("");
        login.insertPass("");
        login.clickLogin();
        login.loginNok();
    }

}

