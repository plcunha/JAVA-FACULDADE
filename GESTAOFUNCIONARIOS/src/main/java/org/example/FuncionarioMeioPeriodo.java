package org.example;

public class FuncionarioMeioPeriodo extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioMeioPeriodo(String nome, String cpf, int horasTrabalhadas, double valorHora) {
        super(nome, cpf, horasTrabalhadas * valorHora);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
