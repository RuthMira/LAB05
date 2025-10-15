package br.edu.fatec.sjc;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class NumberAscOrderTest {

    @Test
    void deveOrdenarNumerosDaPilha() throws StackFullException {
        CustomStack<Integer> stack = new CustomStack<>(6, new IntegerStrategy());
        stack.push(42);
        stack.push(10);
        stack.push(25);
        stack.push(5);
        stack.push(60);
        stack.push(33);

        NumberAscOrder<Integer> order = new NumberAscOrder<>(stack);
        List<Integer> ordenados = order.sort();

        assertEquals(List.of(5, 10, 25, 33, 42, 60), ordenados);
    }

    @Test
    void deveRetornarListaVaziaSePilhaEstiverVazia() {
        CustomStack<Integer> stack = new CustomStack<>(6, new IntegerStrategy());

        NumberAscOrder<Integer> order = new NumberAscOrder<>(stack);
        List<Integer> ordenados = order.sort();

        assertTrue(ordenados.isEmpty());
    }
}