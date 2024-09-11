package org.example;

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;

    public Estagiario(String nome, String cpf, String instituicaoEnsino, double bolsaAuxilio) {
        super(nome, cpf, bolsaAuxilio);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }
}
