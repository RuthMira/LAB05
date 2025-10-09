# 🚀 TDD com JUnit 5: Exercícios de Validação e Cálculo

Este repositório contém três projetos separados, cada um implementado seguindo o ciclo **TDD (Test-Driven Development)** e utilizando o **JUnit 5** para testes unitários.

Os projetos são:

1.  **`triangulo`**: Classificação de Triângulos.
2.  **`person`**: Validação de Pessoa e Email.
3.  **`salario`**: Calculadora de Salário.

## 🛠️ Requisitos de Ambiente

Para construir e executar os testes dos projetos, você precisa ter instalados:

  * **Java Development Kit (JDK) 17+**
  * **Apache Maven 3.8+**

Você pode verificar suas versões com os seguintes comandos:

```bash
java -version
mvn -version
```

-----

## 🏗️ Procedimentos de Build e Teste

Cada projeto deve ser construído e testado individualmente dentro de seu respectivo diretório.

### 1\. 🔺 Exercício 1 - Classificação de Triângulos (`triangulo`)

Este projeto implementa a lógica para classificar um triângulo (Equilátero, Isósceles, Escaleno) e verificar a condição de existência.

#### Estrutura do Projeto

```
triangulo/
├── pom.xml
└── src/
    ├── main/java/com/example/triangulo/Triangulo.java
    └── test/java/com/example/triangulo/TrianguloTest.java
```

#### Execução

Navegue até o diretório do projeto e execute os comandos:

```bash
# Entrar no diretório do projeto
cd triangulo/

# Limpar, compilar o código e baixar as dependências
mvn clean compile

# Executar os testes unitários
mvn test
```

**Saída esperada dos testes:**

```
Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

### 2\. 👤 Exercício 2 - Validação de Pessoa e Email (`person`)

Este projeto implementa a validação de um objeto `Person` com regras sobre nome, idade e formato de email, utilizando TDD.

#### Estrutura do Projeto

```
person/
├── pom.xml
└── src/
    ├── main/java/com/example/person/...
    └── test/java/com/example/person/PersonValidatorTest.java
```

#### Execução

Navegue até o diretório do projeto e execute os comandos:

```bash
# Entrar no diretório do projeto
cd person/

# Limpar, compilar o código e baixar as dependências
mvn clean compile

# Executar os testes unitários
mvn test
```

**Saída esperada dos testes:**

```
Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

### 3\. 💼 Exercício 3 - Calculadora de Salário (`salario`)

Este projeto implementa uma calculadora de salário líquido aplicando diferentes regras de desconto baseadas no `Cargo` e no `salarioBase`, seguindo a metodologia TDD.

#### Estrutura do Projeto

```
salario/
├── pom.xml
└── src/
    ├── main/java/com/example/salario/...
    └── test/java/com/example/salario/CalculadoraSalarioTest.java
```

#### Execução

Navegue até o diretório do projeto e execute os comandos:

```bash
# Entrar no diretório do projeto
cd salario/

# Limpar, compilar o código e baixar as dependências
mvn clean compile

# Executar os testes unitários
mvn test
```

**Saída esperada dos testes:**

```
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

-----
