package com.example.salario;

public class CalculadoraSalario {

    public double calcular(Funcionario f) {
        double salario = f.getSalarioBase();
        Cargo cargo = f.getCargo();

        switch (cargo) {
            case DESENVOLVEDOR:
                return salario * (salario >= 3000 ? 0.8 : 0.9);
            case DBA:
            case TESTADOR:
                return salario * (salario >= 2000 ? 0.75 : 0.85);
            case GERENTE:
                return salario * (salario >= 5000 ? 0.7 : 0.8);
            default:
                throw new IllegalArgumentException("Cargo inválido");
        }
    }
}
