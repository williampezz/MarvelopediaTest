package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.pages.LoginPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginEmptySteps {

    private LoginPage login = new LoginPage();
    @Dado("^que o usuario acesse a tela de Login do app com campo de Email e Senha em branco$")
    public void que_o_usuario_acesse_a_tela_de_Login_do_app_com_campo_de_Email_e_Senha_em_branco() throws Throwable {
        login.insertEmail("");
        login.insertPass("");
    }

    @Quando("^clicar no botão Login$")
    public void clicar_no_botão_Login() throws Throwable {
        login.clickLogin();
    }

    @Então("^mensagem de erro deve ser apresentada e Login não deve ser realizado$")
    public void mensagem_de_erro_deve_ser_apresentada_e_Login_não_deve_ser_realizado() throws Throwable {
        login.loginNok();
    }


}
