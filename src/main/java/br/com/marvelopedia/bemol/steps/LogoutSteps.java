package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.pages.LogoutPage;
import br.com.marvelopedia.bemol.test.LoginTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
public class LogoutSteps {

    private LoginTest login = new LoginTest();

    private LogoutPage logout = new LogoutPage();

    @Dado("^que o usuario esteja logado no aplicativo$")
    public void que_o_usuario_esteja_logado_no_aplicativo() throws Throwable {
        login.LoginValid();

    }

    @Quando("^selecionar Logout$")
    public void selecionar_Logout() throws Throwable {
        logout.clickPerfil();
        logout.clickLogout();
    }

    @Entao("^app deve ser desligado$")
    public void app_deve_ser_desligado() throws Throwable {
        logout.confirmeLogout();
        logout.verifyLogout();
    }
}
