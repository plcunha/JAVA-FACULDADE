package org.example;

public class Main {
    public static void main(String[] args) {
        GeradorDeSenhas gerador = new GeradorDeSenhas();


        int comprimento = 12;
        boolean usarMinusculas = true;
        boolean usarMaiusculas = true;
        boolean usarDigitos = true;
        boolean usarSimbolos = true;

        String senha = gerador.gerarSenha(comprimento, usarMinusculas, usarMaiusculas, usarDigitos, usarSimbolos);
        System.out.println("Senha gerada: " + senha);
    }
}
