package br.com.marvelopedia.bemol.steps;

import br.com.marvelopedia.bemol.core.BasePage;
import br.com.marvelopedia.bemol.core.BaseTest;
import br.com.marvelopedia.bemol.pages.ScreenComicsPage;
import br.com.marvelopedia.bemol.test.LoginTest;
import br.com.marvelopedia.bemol.test.ScreenComicsTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ScreenComicsSteps extends BasePage {

    private LoginTest login = new LoginTest();
    private ScreenComicsPage screenComics = new ScreenComicsPage();

    @Dado("^que o usuario acessa a aba Quadrinhos$")
    public void que_o_usuario_acessa_a_aba_Quadrinhos() throws Throwable {
        login.LoginValid();
    }

    @Quando("^pesquisar pelo nome de um quadrinho$")
    public void pesquisar_pelo_nome_de_um_quadrinho() throws Throwable {
        screenComics.SearchComics("Spider-man");
    }

    @Entao("^deve ser retornado o resultado pesquisado$")
    public void deve_ser_retornado_o_resultado_pesquisado() throws Throwable {
        screenComics.SelectComics();
    }
}
