package org.example;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Estudar Java", "10/09/2024");
        System.out.println("Caso de Teste 1:");
        System.out.println("Nome esperado: Estudar Java | Nome obtido: " + tarefa.getNome());
        System.out.println("Prazo esperado: 10/09/2024 | Prazo obtido: " + tarefa.getPrazo());
        System.out.println("Status esperado: false | Status obtido: " + tarefa.isConcluida());
        System.out.println();

        tarefa.concluirTarefa();
        System.out.println("Caso de Teste 2:");
        System.out.println("Status esperado após conclusão: true | Status obtido: " + tarefa.isConcluida());
        System.out.println();

        tarefa.alterarPrazo("15/09/2024");
        System.out.println("Caso de Teste 3:");
        System.out.println("Novo prazo esperado: 15/09/2024 | Novo prazo obtido: " + tarefa.getPrazo());
    }
}
