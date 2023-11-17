package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.core.BasePage;
import br.com.marvelopedia.bemol.pages.RegisterPage;
import br.com.marvelopedia.bemol.utils.EmailGen;
import cucumber.api.java.pt.*;

public class RegisterNewPassEmptySteps extends BasePage {

    EmailGen emailGenerator = new EmailGen();
    String generatedEmail = emailGenerator.genEmailRandom();
    private RegisterPage register = new RegisterPage();

    @Dado("^que o usuario acesse o formulario de cadastro e preencha o Email corretamente$")
    public void que_o_usuario_acesse_o_formulario_de_cadastro_e_preencha_o_Email_corretamente() throws Throwable {
        register.clickRegister();
        register.insertNewEmail(generatedEmail+"@test.com");
    }

    @E("^preencha a Senha corretamente deixando o RepitaSenha em branco$")
    public void preencha_a_Senha_corretamente_deixando_o_RepitaSenha_em_branco() throws Throwable {
        register.insertPass("123456");
    }

    @Quando("^clicar no botão para Cadastrar$")
    public void clicar_no_botão_para_Cadastrar() throws Throwable {
        register.clickRegisterButton();
    }

    @Então("^usuario NAO deve ser cadastrado e mensagem deve ser exibida$")
    public void usuario_NAO_deve_ser_cadastrado_e_mensagem_deve_ser_exibida() throws Throwable {
        register.registerEmpty();
    }

}
