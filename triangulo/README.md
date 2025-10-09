# 🔺 Exercício 1 - Classificação de Triângulos (TDD com JUnit 5)

## 🧩 Descrição do Problema
O programa lê três valores inteiros que representam os lados de um triângulo e informa se ele é:
- **Equilátero** (todos os lados iguais)
- **Isósceles** (dois lados iguais)
- **Escaleno** (todos os lados diferentes)

**Condição de existência:** a soma de dois lados deve ser maior que o terceiro lado.

## ⚙️ Estrutura do Projeto
```
triangulo-tdd/
├── pom.xml
├── README.md
└── src/
    ├── main/java/com/example/triangulo/Triangulo.java
    └── test/java/com/example/triangulo/TrianguloTest.java
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
Execute todos os testes automatizados:
```bash
mvn test
```

Saída esperada:
```
Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## 🧠 Abordagem TDD
1. Criar um teste que falha (Red)  
2. Implementar o código mínimo para passar (Green)  
3. Refatorar mantendo os testes passando (Refactor)
