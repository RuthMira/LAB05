# 💼 Exercício 3 - Calculadora de Salário (TDD com JUnit 5)

## 🧩 Descrição do Problema
Implementar uma calculadora de salário líquido com base no cargo e salário base do funcionário.

### Regras de Desconto

| Cargo | Regra |
|--------|--------|
| **DESENVOLVEDOR** | 20% se salário ≥ 3000; senão 10% |
| **DBA** | 25% se salário ≥ 2000; senão 15% |
| **TESTADOR** | 25% se salário ≥ 2000; senão 15% |
| **GERENTE** | 30% se salário ≥ 5000; senão 20% |

## ⚙️ Estrutura do Projeto
```
salario-tdd/
├── pom.xml
├── README.md
└── src/
    ├── main/java/com/example/salario/
    │   ├── Cargo.java
    │   ├── Funcionario.java
    │   └── CalculadoraSalario.java
    └── test/java/com/example/salario/
        └── CalculadoraSalarioTest.java
```

## 🛠️ Requisitos
- Java 17+
- Apache Maven 3.8+

Verifique as versões:
```bash
java -version
mvn -version
```

## 🏗️ Procedimentos de Build
Compile o projeto e baixe dependências:
```bash
mvn clean compile
```

## 🧪 Execução dos Testes
Rode os testes unitários com JUnit 5:
```bash
mvn test
```

Exemplo de saída:
```
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## 🧠 Abordagem TDD
1. Escrever testes de cálculo para cada cargo.  
2. Implementar apenas o necessário até os testes passarem.  
3. Refatorar o código mantendo os testes verdes.
