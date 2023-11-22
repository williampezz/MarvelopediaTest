package br.com.marvelopedia.bemol.test;

import br.com.marvelopedia.bemol.pages.LogoutPage;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class LogoutTest extends LogoutPage {

    private LogoutPage logout = new LogoutPage();

    @Before // antes de executar a classe de teste, executa o login reaproveitando da pagina LoginTest
    public void setUp() throws MalformedURLException {
        LoginTest loginTest = new LoginTest();
        loginTest.LoginValid();
    }

    @Test
    public void LogoutTest() {
        logout.clickPerfil();
        logout.clickLogout();
        logout.confirmeLogout();
        logout.verifyLogout();
    }
}
