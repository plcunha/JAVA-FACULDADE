# ☕ JAVA-FACULDADE

Atividades de Java realizadas na faculdade — projetos práticos cobrindo lógica, orientação a objetos, herança e polimorfismo.

## Projetos

| Projeto | Descrição |
|---------|-----------|
| **FizzBuzz** | Implementação clássica do FizzBuzz de 1 a 100 |
| **PONTUACAO** | Sistema de pontuação com adição e remoção de pontos |
| **SENHAS** | Gerador de senhas seguras com `SecureRandom` |
| **TAREFAS** | Gerenciador simples de tarefas com nome, prazo e status |
| **GESTAOFUNCIONARIOS** | Sistema de gestão de funcionários com herança (tempo integral, meio período, estagiário) |
| **SISTEMARPG** | Sistema de RPG com classes Guerreiro, Mago e Arqueiro usando herança e polimorfismo |

## Estrutura

Cada projeto é um módulo Maven independente com a seguinte estrutura:

```
PROJETO/
├── pom.xml
└── src/
    ├── main/java/org/example/   # Código-fonte
    └── test/java/org/example/   # Testes (quando existentes)
```

## Como executar

**Pré-requisitos:** Java 22+ e Maven instalados.

```bash
# Entrar no diretório do projeto desejado
cd PROJETO

# Compilar
mvn compile

# Executar testes (quando disponíveis)
mvn test
```

## Tecnologias

- Java 22
- Maven
- JUnit 5 (testes)
