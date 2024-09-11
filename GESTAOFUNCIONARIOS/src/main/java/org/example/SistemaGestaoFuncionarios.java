package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaGestaoFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioTempoIntegral("João", "123.456.789-00", 5000, 10));
        funcionarios.add(new FuncionarioMeioPeriodo("Maria", "987.654.321-00", 20, 50));
        funcionarios.add(new Estagiario("Pedro", "111.222.333-44", "IFPR", 1500));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Salário: " + funcionario.calcularSalario());
            System.out.println();
        }

        scanner.close();
    }
}
