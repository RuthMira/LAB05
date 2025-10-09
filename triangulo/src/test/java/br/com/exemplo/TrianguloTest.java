package br.com.exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.com.exemplo.Triangulo.Tipo;

public class TrianguloTest {

    @Test
    void deveSerEquilatero() {
        assertEquals(Tipo.EQUILATERO, Triangulo.classificar(5, 5, 5));
    }

    @Test
    void deveSerEscaleno() {
        assertEquals(Tipo.ESCALENO, Triangulo.classificar(4, 5, 6));
    }

    @Test
    void deveSerIsosceles1() {
        assertEquals(Tipo.ISOSCELES, Triangulo.classificar(5, 5, 3));
    }

    @Test
    void deveSerIsosceles2() {
        assertEquals(Tipo.ISOSCELES, Triangulo.classificar(5, 3, 5));
    }

    @Test
    void deveSerIsosceles3() {
        assertEquals(Tipo.ISOSCELES, Triangulo.classificar(3, 5, 5));
    }

    @Test
    void ladoZeroInvalido() {
        assertEquals(Tipo.INVALIDO, Triangulo.classificar(0, 5, 5));
    }

    @Test
    void ladoNegativoInvalido() {
        assertEquals(Tipo.INVALIDO, Triangulo.classificar(-1, 4, 5));
    }

    @Test
    void somaIgualAoTerceiro1() {
        assertEquals(Tipo.INVALIDO, Triangulo.classificar(2, 3, 5));
    }

    @Test
    void somaIgualAoTerceiro2() {
        assertEquals(Tipo.INVALIDO, Triangulo.classificar(3, 5, 2));
    }

    @Test
    void somaIgualAoTerceiro3() {
        assertEquals(Tipo.INVALIDO, Triangulo.classificar(5, 2, 3));
    }

    @Test
    void somaMenorQueTerceiro1() {
        assertEquals(Tipo.INVALIDO, Triangulo.classificar(2, 3, 6));
    }

    @Test
    void somaMenorQueTerceiro2() {
        assertEquals(Tipo.INVALIDO, Triangulo.classificar(3, 6, 2));
    }

    @Test
    void somaMenorQueTerceiro3() {
        assertEquals(Tipo.INVALIDO, Triangulo.classificar(6, 2, 3));
    }

    @Test
    void todosZeroInvalido() {
        assertEquals(Tipo.INVALIDO, Triangulo.classificar(0, 0, 0));
    }
}
