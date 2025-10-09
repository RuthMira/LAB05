package br.com.exemplo;

public class Triangulo {

    public enum Tipo {
        EQUILATERO,
        ISOSCELES,
        ESCALENO,
        INVALIDO
    }

    public static Tipo classificar(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return Tipo.INVALIDO;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            return Tipo.INVALIDO;
        }

        if (a == b && b == c) {
            return Tipo.EQUILATERO;
        }

        if (a == b || a == c || b == c) {
            return Tipo.ISOSCELES;
        }

        return Tipo.ESCALENO;
    }
}
