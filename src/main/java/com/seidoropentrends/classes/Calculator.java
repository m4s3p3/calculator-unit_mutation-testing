package com.seidoropentrends.classes;

public class Calculator {

    /**
     * Suma dos enters.
     */
    public int suma(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos enters.
     */
    public int resta(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos enters.
     */
    public int multiplica(int a, int b) {
        return a * b;
    }

    /**
     * Divideix dos enters.
     * Llença IllegalArgumentException si el divisor és zero.
     */
    public int divideix(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No es pot dividir per zero");
        }
        return a / b;
    }

    /**
     * Retorna el màxim entre dos enters.
     */
    public int maxim(int a, int b) {
        return (a >= b) ? a : b;
    }

    /**
     * Calcula l'arrel quadrada d'un nombre.
     * Llença IllegalArgumentException si el nombre és negatiu.
     */
    public double arrelQuadrada(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("No es pot calcular arrel quadrada de negatius");
        }
        return Math.sqrt(x);
    }

    /**
     * Comprova si un nombre és positiu.
     */
    public boolean esPositiu(int numero) {
        return numero > 0;
    }

    /**
     * Calcula la potència d'un nombre (base^exponent).
     * Només funciona amb exponents positius.
     */
    public int potencia(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent ha de ser positiu");
        }
        if (exponent == 0) {
            return 1;
        }
        int resultat = 1;
        for (int i = 0; i < exponent; i++) {
            resultat *= base;
        }
        return resultat;
    }
}