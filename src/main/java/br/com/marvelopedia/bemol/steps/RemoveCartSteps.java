package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.pages.AddCartPage;
import br.com.marvelopedia.bemol.pages.LoginPage;
import br.com.marvelopedia.bemol.pages.ScreenComicsPage;
import br.com.marvelopedia.bemol.test.LoginTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RemoveCartSteps {

    private LoginTest login = new LoginTest();
    private AddCartPage addCart = new AddCartPage();

    @Dado("^que o usuario tenha produtos no carrinho$")
    public void que_o_usuario_tenha_produtos_no_carrinho() throws Throwable {
        login.LoginValid();
        addCart.SelectComic();
        addCart.AddQntd();

    }

    @Quando("^remover produtodos do carrinho$")
    public void remover_produtodos_do_carrinho() throws Throwable {
        addCart.AddCart();

    }

    @Entao("^produto deve ser removido$")
    public void produto_deve_ser_removido() throws Throwable {
        addCart.RemoveCart();
    }



    }
