package org.example;

public class FuncionarioTempoIntegral extends Funcionario {
    private double bonus;

    public FuncionarioTempoIntegral(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1 + bonus / 100);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
