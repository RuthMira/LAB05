# 👤 Exercício 2 - Validação de Pessoa e Email (TDD com JUnit 5)

## 🧩 Descrição do Problema
Implementar o método `isValidToInclude()` que valida um objeto `Person` com base nas regras:

- O nome deve ter **pelo menos duas partes** e conter apenas letras.
- A idade deve estar no intervalo **[1, 200]**.
- A pessoa deve ter **pelo menos um email** associado.
- Cada email deve estar no formato **"____@____.___"**, com ao menos um caractere em cada parte.

## ⚙️ Estrutura do Projeto
```
person-tdd/
├── pom.xml
├── README.md
└── src/
    ├── main/java/com/example/person/
    │   ├── Person.java
    │   ├── Email.java
    │   └── PersonValidator.java
    └── test/java/com/example/person/
        └── PersonValidatorTest.java
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
Execute os testes unitários criados via TDD:
```bash
mvn test
```

Exemplo de saída esperada:
```
Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## 🧠 Abordagem TDD
1. Criar um teste para cada regra de validação.  
2. Implementar o código mínimo até todos passarem.  
3. Refatorar mantendo todos os testes verdes.
