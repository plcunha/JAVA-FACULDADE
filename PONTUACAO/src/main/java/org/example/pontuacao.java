public class pontuacao {

    private int pontuacao;

    public pontuacao() {
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
        pontuacao p = new pontuacao();

        p.adicionarPontos(10);
        System.out.println("Pontuação atual: " + p.getPontuacao()); // Should print 10

        p.removerPontos(5);
        System.out.println("Pontuação atual: " + p.getPontuacao()); // Should print 5

        p.removerPontos(10);
        System.out.println("Pontuação atual: " + p.getPontuacao()); // Should print 0
    }
}
