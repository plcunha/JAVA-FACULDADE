package org.example;

public class SistemaRPG {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Zeca", 10, 100, 20, 10, 5, 2);
        Mago mago = new Mago("Sérgio", 10, 80, 15, 5, 50, 25);
        Arqueiro arqueiro = new Arqueiro("Claudio", 10, 90, 18, 8, 10, 15);

        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();

        System.out.println("\n--- Batalha ---\n");

        guerreiro.atacar(mago);
        mago.lancarMagia(guerreiro);
        arqueiro.atirarFlecha(guerreiro);

        System.out.println("\n--- Status após a primeira rodada ---\n");

        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();
    }
}
