package br.com.marvelopedia.bemol.pages;

import br.com.marvelopedia.bemol.core.BasePage;

public class ScreenComicsPage extends BasePage {

    public void SearchComics(String comics) {
        sendKeyByHint("//android.widget.EditText[@hint='search text Pesquise quadrinhos']", comics);
    }

    public void SelectComics() {
        findElementByText("//android.widget.Image[@text='5defb2083cd4c']").click();
    }

    public void SelectComic() {
        findElementByText("//android.widget.Image[@text='5defb2083cd4c']").click();
    }

    public void AddQntd() {
        findElementByText("//android.widget.Button[@text='+']").click();
    }

    public void AddCart() {
        findElementByText("//android.widget.Button[contains(@text, 'Adicionar')]").click();
        findElementByText("Carrinho").isDisplayed();
    }
}
