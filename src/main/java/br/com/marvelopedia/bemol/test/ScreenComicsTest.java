package br.com.marvelopedia.bemol.test;

import br.com.marvelopedia.bemol.core.BasePage;
import br.com.marvelopedia.bemol.core.BaseTest;
import br.com.marvelopedia.bemol.pages.AddCartPage;
import br.com.marvelopedia.bemol.pages.ScreenComicsPage;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class ScreenComicsTest extends BaseTest {

    private ScreenComicsPage screenComics = new ScreenComicsPage();
    private AddCartPage addCart = new AddCartPage();

    @Before // antes de executar a classe de teste, executa o login reaproveitando da pagina LoginTest
    public void setUp() throws MalformedURLException {
        LoginTest loginTest = new LoginTest();
        loginTest.LoginValid();
    }

    @Test
    public void SearchComics()  {
        screenComics.SearchComics("Spider-man");
        screenComics.SelectComics();
    }

    @Test
    public void addCart() {
        addCart.SelectComic();
        addCart.AddQntd();
        addCart.AddCart();
    }

    @Test
    public void AbandonedCart() {
        addCart.SelectComic();
        addCart.AddQntd();
        addCart.AddCart();
        addCart.AbandonedCart();
    }

    @Test
    public void RemoveCart() {
        addCart.SelectComic();
        addCart.AddQntd();
        addCart.AddCart();
        addCart.RemoveCart();
    }
}
