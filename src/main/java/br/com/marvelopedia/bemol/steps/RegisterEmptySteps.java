package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.pages.RegisterPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class RegisterEmptySteps {

    private RegisterPage register = new RegisterPage();

    @Dado("^que o usuario deixe o campo Email, Senha e RepitaSenha em branco$")
    public void que_o_usuario_deixe_o_campo_Email_Senha_e_RepitaSenha_em_branco() throws Throwable {
        register.clickRegister();
    }

    @Quando("^clicar no botão para se Cadastrar$")
    public void clicar_no_botão_para_se_Cadastrar() throws Throwable {
        register.clickRegisterButton();
    }


    @Então("^mensagem de erro deve ser apresentada e Cadastro não deve ser realizado$")
    public void mensagem_de_erro_deve_ser_apresentada_e_Cadastro_não_deve_ser_realizado() throws Throwable {
        register.registerEmpty();
    }

}
