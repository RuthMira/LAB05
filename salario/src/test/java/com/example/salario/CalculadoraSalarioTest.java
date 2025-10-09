package com.example.salario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSalarioTest {

    private final CalculadoraSalario calculadora = new CalculadoraSalario();

    @Test
    public void testDesenvolvedorComSalarioMaiorOuIgual3000() {
        Funcionario f = new Funcionario("João", "joao@teste.com", 3000, Cargo.DESENVOLVEDOR);
        assertEquals(2400.0, calculadora.calcular(f), 0.001);
    }

    @Test
    public void testDesenvolvedorComSalarioMenorQue3000() {
        Funcionario f = new Funcionario("Ana", "ana@teste.com", 2500, Cargo.DESENVOLVEDOR);
        assertEquals(2250.0, calculadora.calcular(f), 0.001);
    }

    @Test
    public void testDBAComSalarioMaiorOuIgual2000() {
        Funcionario f = new Funcionario("Pedro", "pedro@teste.com", 2500, Cargo.DBA);
        assertEquals(1875.0, calculadora.calcular(f), 0.001);
    }

    @Test
    public void testDBAComSalarioMenorQue2000() {
        Funcionario f = new Funcionario("Maria", "maria@teste.com", 1500, Cargo.DBA);
        assertEquals(1275.0, calculadora.calcular(f), 0.001);
    }

    @Test
    public void testTestadorComSalarioMaiorOuIgual2000() {
        Funcionario f = new Funcionario("Lucas", "lucas@teste.com", 2500, Cargo.TESTADOR);
        assertEquals(1875.0, calculadora.calcular(f), 0.001);
    }

    @Test
    public void testGerenteComSalarioMaiorOuIgual5000() {
        Funcionario f = new Funcionario("Paula", "paula@teste.com", 5000, Cargo.GERENTE);
        assertEquals(3500.0, calculadora.calcular(f), 0.001);
    }

    @Test
    public void testGerenteComSalarioMenorQue5000() {
        Funcionario f = new Funcionario("Ricardo", "ricardo@teste.com", 4000, Cargo.GERENTE);
        assertEquals(3200.0, calculadora.calcular(f), 0.001);
    }
}
