package br.com.marvelopedia.bemol.pages;

import br.com.marvelopedia.bemol.core.BasePage;

public class AddCartPage extends BasePage {

    public void SelectComic() {
        findElementByText("//android.widget.Image[@text='6489f06c4f5b6']").click();
    }

    public void AddQntd() {
        findElementByText("//android.widget.Button[@text='+']").click();
    }

    public void AddCart() {
        findElementByText("//android.widget.Button[contains(@text, 'Adicionar')]").click();
        findElementByText("//android.view.View[@text='Carrinho']").isDisplayed();
    }

    public void AbandonedCart() {
        findElementByText("//android.view.View[@text='Carrinho']").isDisplayed();
    }

    public void RemoveCart() {
        findElementByText("//android.view.View[@text='close']").click();

        //Cenario vai falhar pois existe 2 bugs no app
        //1 - A imagem de carrinho vazio nao é exibida
        //2 - O valor do carrinho nao é zerado
        findElementByText("//android.widget.Image[@text='emptycart']").isDisplayed();
    }
}
