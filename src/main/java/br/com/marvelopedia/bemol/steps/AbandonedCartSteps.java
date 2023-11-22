package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.pages.AddCartPage;
import br.com.marvelopedia.bemol.test.LoginTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AbandonedCartSteps {

    private AddCartPage addCart = new AddCartPage();
    private LoginTest login = new LoginTest();

    @Dado("^que o usuario possua produtos no carrinho$")
    public void que_o_usuario_possua_produtos_no_carrinho() throws Throwable {
        login.LoginValid();
        addCart.SelectComic();
        addCart.AddQntd();



    }

    @Quando("^selecionar o icone do carrinho$")
    public void selecionar_o_icone_do_carrinho() throws Throwable {
        addCart.AddCart();
    }

    @Entao("^deve ser aberta pagina do carrinho com os produtos adicionados$")
    public void deve_ser_aberta_pagina_do_carrinho_com_os_produtos_adicionados() throws Throwable {
        addCart.AbandonedCart();
    }
}
