# Projeto TDD - PersonDAO

Validação de objetos `Person` com base em requisitos de nome, idade e e-mail, usando **JUnit 5** e **TDD**.

### 🧪 Testes
Execute:
```bash
mvn test
```

### 🧰 Regras de Validação
- Nome tem pelo menos duas partes e só letras  
- Idade ∈ [1, 200]  
- Deve ter ao menos um e-mail  
- E-mail válido no formato `nome@dominio.extensao`
