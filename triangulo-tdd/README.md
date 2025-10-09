# Triângulo

## Descrição
Este projeto implementa uma classe Java para determinar o tipo de triângulo (equilátero, isósceles ou escaleno) com base nos valores dos três lados informados.

A lógica considera a regra geométrica:
> A soma de dois lados deve ser maior que o terceiro lado.

Inclui também uma suíte de testes automatizados desenvolvidos em **JUnit 5** seguindo princípios de **TDD (Test Driven Development)**.

---

## 🧰 Tecnologias
- Java 17+
- Maven
- JUnit 5

---

## 🚀 Como executar o projeto

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/usuario/triangulo-tdd.git
cd triangulo-tdd
```

### 2️⃣ Compilar o projeto
```bash
mvn clean compile
```

### 3️⃣ Executar os testes
```bash
mvn test
```

---

## 🧪 Casos de teste contemplados

| Tipo de Triângulo | Descrição | Exemplo |
|-------------------|------------|----------|
| Equilátero | Três lados iguais | (5,5,5) |
| Isósceles | Dois lados iguais | (5,5,3), (5,3,5), (3,5,5) |
| Escaleno | Três lados diferentes | (4,5,6) |
| Inválido | Um lado zero | (0,5,5) |
| Inválido | Um lado negativo | (-1,4,5) |
| Inválido | Soma de dois lados = terceiro | (2,3,5), (3,5,2), (5,2,3) |
| Inválido | Soma de dois lados < terceiro | (2,3,6), (3,6,2), (6,2,3) |
| Inválido | Todos os lados iguais a zero | (0,0,0) |
