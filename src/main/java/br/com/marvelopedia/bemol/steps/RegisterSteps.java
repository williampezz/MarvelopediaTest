package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.pages.RegisterPage;
import br.com.marvelopedia.bemol.utils.EmailGen;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class RegisterSteps {

    EmailGen emailGenerator = new EmailGen();
    String generatedEmail = emailGenerator.genEmailRandom();
    private RegisterPage register = new RegisterPage();

    @Dado("^que o usuario acesse o formulario de cadastro e informe os dados de Email e Senha validos$")
    public void que_o_usuario_acesse_o_formulario_de_cadastro_e_informe_os_dados_de_Email_e_Senha_validos() throws Throwable {
        register.clickRegister();
        register.insertNewEmail(generatedEmail+"@test.com");
        register.insertPass("123456");
        register.insertNewPass("123456");
    }

    @Quando("^selecionar o botão Cadastrar$")
    public void selecionar_o_botão_Cadastrar() throws Throwable {
        register.clickRegisterButton();
    }

    @Então("^usuario deve ser cadastrado$")
    public void usuario_deve_ser_cadastrado() throws Throwable {
        register.registerOk();
    }
}
