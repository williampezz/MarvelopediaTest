package br.com.marvelopedia.bemol.core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


public class BaseTest {

    @AfterClass
    public static void finalizarClasse() {
        DriverFactory.killDriver();
    }
    @After
    public void tearDown() {
        gerarScreenShot();
        DriverFactory.getDriver().resetApp();
    }

    public void gerarScreenShot() {

        try {
            File imagem =  ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem, new File("target/screenshots/imagem.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void waitElement() {
        try { //Esses tryCatch pausam o código por 2s, para dar tempo de carregar a tela
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}