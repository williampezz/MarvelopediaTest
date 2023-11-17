package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.pages.LoginPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginInvalidSteps {

    private LoginPage login = new LoginPage();


    @Dado("^que o usuario acesse a tela de Login do app e informe Email e senha Invalidos$")
    public void que_o_usuario_acesse_a_tela_de_Login_do_app_e_informe_Email_e_senha_Invalidos() throws Throwable {
        login.insertEmail("williamteste@teste.com");
        login.insertPass("senhainvalida");

    }

    @Quando("^clicar no botão Login$")
    public void clicar_no_botão_Login() throws Throwable {
        login.clickLogin();
    }


    @Então("^login nao deve ser realizado e mensagem de erro deve ser apresentado$")
    public void login_nao_deve_ser_realizado_e_mensagem_de_erro_deve_ser_apresentado() throws Throwable {

    }
}
