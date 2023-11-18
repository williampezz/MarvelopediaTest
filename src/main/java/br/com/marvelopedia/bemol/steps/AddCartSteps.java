package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.pages.AddCartPage;
import br.com.marvelopedia.bemol.test.LoginTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AddCartSteps {

    private AddCartPage addCart = new AddCartPage();
    private LoginTest login = new LoginTest();

    @Dado("^que o usuario esteja logado no app e na aba Quadrinhos$")
    public void que_o_usuario_esteja_logado_no_app_e_na_aba_Quadrinhos() throws Throwable {
        login.LoginValid();
        addCart.SelectComic();

    }

    @Quando("^acessar a PDP de um Quadrinho e selecionar o botao adicionar$")
    public void acessar_a_PDP_de_um_Quadrinho_e_selecionar_o_botao_adicionar() throws Throwable {
        addCart.AddQntd();
    }

    @Entao("^produto deve ser adicionado no carrinho de compras$")
    public void produto_deve_ser_adicionado_no_carrinho_de_compras() throws Throwable {
        addCart.AddCart();
    }
}
