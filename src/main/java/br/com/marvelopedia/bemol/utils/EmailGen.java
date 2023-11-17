package br.com.marvelopedia.bemol.utils;

import java.util.Random;

public class EmailGen {

    private String generatedEmail;

    public String genEmailRandom() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        generatedEmail = saltStr + "@test.com"; // Armazena o email gerado
        return saltStr;
    }

    public String getGeneratedEmail() {
        return generatedEmail;
    }
}
