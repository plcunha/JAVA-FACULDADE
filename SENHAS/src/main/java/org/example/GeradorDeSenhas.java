package org.example;

import java.security.SecureRandom;

public class GeradorDeSenhas {

    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITOS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    private SecureRandom aleatorio = new SecureRandom();

    public String gerarSenha(int length, boolean useLower, boolean useUpper, boolean useDigits, boolean useSymbols) {
        if (length <= 0) {
            return "Comprimento da senha deve ser maior que zero.";
        }

        StringBuilder caracteres = new StringBuilder();
        if (useLower) caracteres.append(LETRAS_MINUSCULAS);
        if (useUpper) caracteres.append(LETRAS_MAIUSCULAS);
        if (useDigits) caracteres.append(DIGITOS);
        if (useSymbols) caracteres.append(SIMBOLOS);

        if (caracteres.length() == 0) {
            return "Pelo menos um tipo de caractere deve ser selecionado.";
        }

        StringBuilder senha = new StringBuilder(length);


        if (useLower) senha.append(LETRAS_MINUSCULAS.charAt(aleatorio.nextInt(LETRAS_MINUSCULAS.length())));
        if (useUpper) senha.append(LETRAS_MAIUSCULAS.charAt(aleatorio.nextInt(LETRAS_MAIUSCULAS.length())));
        if (useDigits) senha.append(DIGITOS.charAt(aleatorio.nextInt(DIGITOS.length())));
        if (useSymbols) senha.append(SIMBOLOS.charAt(aleatorio.nextInt(SIMBOLOS.length())));


        for (int i = senha.length(); i < length; i++) {
            int index = aleatorio.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }


        return embaralharSenha(senha.toString());
    }

    private String embaralharSenha(String senha) {
        char[] caracteres = senha.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            int j = aleatorio.nextInt(caracteres.length);
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }
        return new String(caracteres);
    }
}
