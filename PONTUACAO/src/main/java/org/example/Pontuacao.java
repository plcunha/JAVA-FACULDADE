package org.example;

public class Pontuacao {

    private int pontuacao;

    public Pontuacao() {
        this.pontuacao = 0;
    }

    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
        } else {
            System.out.println("Número de pontos a adicionar deve ser positivo.");
        }
    }

    public void removerPontos(int pontos) {
        if (pontos > 0) {
            this.pontuacao -= pontos;
            if (this.pontuacao < 0) {
                this.pontuacao = 0;
            }
        } else {
            System.out.println("Número de pontos a remover deve ser positivo.");
        }
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public static void main(String[] args) {
        Pontuacao p = new Pontuacao();

        p.adicionarPontos(10);
        System.out.println("Pontuação atual: " + p.getPontuacao());

        p.removerPontos(5);
        System.out.println("Pontuação atual: " + p.getPontuacao());

        p.removerPontos(10);
        System.out.println("Pontuação atual: " + p.getPontuacao());
    }
}
