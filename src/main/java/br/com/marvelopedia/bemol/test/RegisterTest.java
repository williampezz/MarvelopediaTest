package br.com.marvelopedia.bemol.test;

import br.com.marvelopedia.bemol.core.BaseTest;
import br.com.marvelopedia.bemol.pages.RegisterPage;
import br.com.marvelopedia.bemol.utils.EmailGen;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    EmailGen emailGenerator = new EmailGen();
    String generatedEmail = emailGenerator.genEmailRandom();

    private RegisterPage register = new RegisterPage();

    @Test
    public void RegisterValid() {
        register.clickRegister();
        register.insertNewEmail(generatedEmail+"@test.com");
        register.insertPass("123456");
        register.insertNewPass("123456");
        register.clickRegisterButton();
        register.registerOk();
    }
    @Test
    public void RegisterInvalid() {
        register.clickRegister();
        register.insertNewEmail(generatedEmail+"@test.com");
        register.insertPass("123");
        register.insertNewPass("123");
        register.clickRegisterButton();
        register.registerNok();
    }

    @Test
    public void RegisterEmpty() {
        register.clickRegister();
        register.clickRegisterButton();
        register.registerEmpty();
    }

    @Test
    public void RegisterNewPassEmpty() {
        register.clickRegister();
        register.insertNewEmail(generatedEmail+"@test.com");
        register.insertPass("123456");
        register.clickRegisterButton();
        register.registerEmpty();
    }
}
