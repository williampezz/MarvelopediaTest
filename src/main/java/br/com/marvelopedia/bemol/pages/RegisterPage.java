package br.com.marvelopedia.bemol.pages;

import br.com.marvelopedia.bemol.core.BasePage;

public class RegisterPage extends BasePage {

    public void clickRegister(){
        findElementByText("//android.view.View[@text='Crie uma conta']").click();
    }

    public void insertNewEmail(String newEmail) {
        sendKeyByHint("//android.widget.EditText[@hint='Email']", newEmail);
    }

    public void insertPass(String pass) {
        sendKeyByHint("//android.widget.EditText[@hint='Senha']", pass);
    }

    public void insertNewPass(String newPass) {
        sendKeyByHint("//android.widget.EditText[@hint='Repita Senha']", newPass);
    }

    public void clickRegisterButton(){
        findElementByText("//android.widget.Button[@text='Cadastrar']").click();
    }

    public void registerOk() {
        findElementByText("//android.view.View[@text='Cadastro realizado com sucesso!']");
    }

}
