package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class RegisterInvalidSteps extends BasePage  {

    @Dado("^que o usuario acesse o formulario de cadastro$")
    public void que_o_usuario_acesse_o_formulario_de_cadastro() throws Throwable {
        
    }

    @E("^informe um Email valido$")
    public void informe_um_Email_valido() throws Throwable {

    }

    @E("^informe uma senha menor que o requisito mínimo$")
    public void informe_uma_senha_menor_que_o_requisito_mínimo() throws Throwable {

    }

    @Quando("^clicar no botão Cadastrar$")
    public void clicar_no_botão_Cadastrar() throws Throwable {

    }

    @Então("^usuario NAO deve ser cadastrado$")
    public void usuario_NAO_deve_ser_cadastrado() throws Throwable {

    }

    @E("^mensagem de erro deve ser apresentada$")
    public void mensagem_de_erro_deve_ser_apresentada() throws Throwable {

    }
}
