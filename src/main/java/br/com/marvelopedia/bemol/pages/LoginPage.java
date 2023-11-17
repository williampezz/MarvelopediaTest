package br.com.marvelopedia.bemol.pages;

import br.com.marvelopedia.bemol.core.BasePage;

public class LoginPage extends BasePage {

    public void insertEmail(String email) {
        sendKeyByHint("//android.widget.EditText[@hint='E-mail']", email);
    }

    public void insertPass(String pass) {
        sendKeyByHint("//android.widget.EditText[@hint='Senha']", pass);
    }

    public void clickLogin(){
        findElementByText("//android.widget.Button[@text='Login']").click();
    }

    //verifica se o app chegou até a home do app
    public void loginOk() {
        findElementByText("//android.view.View[@text='Quadrinhos']");
    }

    //verifica se o login foi invalido, entao ira permanecer na tela de login
    //Foi pensado nessa estrategia para não utilizar a mensagem de erro, pois a mesma vai necessitar ser alterada para pt-bt
    public void loginNok() {
        findElementByText("//android.widget.Button[@text='Login']").click();
    }
}
