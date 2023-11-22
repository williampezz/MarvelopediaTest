package br.com.marvelopedia.bemol.pages;

import br.com.marvelopedia.bemol.core.BasePage;

public class LogoutPage extends BasePage {

    public void clickPerfil() {
        findElementByText("//android.view.View[@text='person Perfil']").click();
    }

    public void clickLogout() {
        findElementByText("//android.view.View[@text='Logout']").click();
    }

    public void confirmeLogout() {
        findElementByText("//android.widget.Button[@text='SIM']").click();
    }

    public void verifyLogout() {
        findElementByText("//android.view.View[@text='MARVELOPÉDIA']").isDisplayed();
    }
}
