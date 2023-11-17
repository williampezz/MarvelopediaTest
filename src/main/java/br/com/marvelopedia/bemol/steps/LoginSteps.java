package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.pages.LoginPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

    private LoginPage login = new LoginPage();

    @Dado("^que o usuario acesse a tela de Login do app e preencha Email e Senha$")
    public void que_o_usuario_acesse_a_tela_de_Login_do_app_e_preencha_Email_e_Senha()  {
        login.insertEmail("williamteste@teste.com");
        login.insertPass("1234567");
    }

    @Quando("^clicar no botão Login$")
    public void clicar_no_botão_Login() throws Throwable {
        login.clickLogin();
    }

    @Então("^login deve ser realizado com sucesso$")
    public void login_deve_ser_realizado_com_sucesso() throws Throwable {
        login.loginOk();
    }
}
