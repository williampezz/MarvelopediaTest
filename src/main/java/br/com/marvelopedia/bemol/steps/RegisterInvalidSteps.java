package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.core.BasePage;
import br.com.marvelopedia.bemol.pages.RegisterPage;
import br.com.marvelopedia.bemol.utils.EmailGen;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class RegisterInvalidSteps extends BasePage  {

    EmailGen emailGenerator = new EmailGen();
    String generatedEmail = emailGenerator.genEmailRandom();
    private RegisterPage register = new RegisterPage();

    @Dado("^que o usuario acesse o formulario de cadastro$")
    public void que_o_usuario_acesse_o_formulario_de_cadastro() throws Throwable {
        register.clickRegister();

    }

    @E("^informe um Email valido$")
    public void informe_um_Email_valido() throws Throwable {
        register.insertNewEmail(generatedEmail+"@test.com");
    }

    @E("^informe uma senha menor que o requisito mínimo$")
    public void informe_uma_senha_menor_que_o_requisito_mínimo() throws Throwable {
        register.insertPass("123");
        register.insertNewPass("123");
    }

    @Quando("^clicar no botão Cadastrar$")
    public void clicar_no_botão_Cadastrar() throws Throwable {
        register.clickRegisterButton();
    }

    @Então("^usuario NAO deve ser cadastrado e mensagem de erro deve ser apresentada$")
    public void usuario_NAO_deve_ser_cadastrado_e_mensagem_de_erro_deve_ser_aoresentada() throws Throwable {
        register.registerNok();
    }

}
