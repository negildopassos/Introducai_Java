package com.negildo.sobrecarga;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int soma1 = calc.soma(1,2);
        System.out.println(soma1);

        int soma2 = calc.soma(1,2,3);
        System.out.println(soma2);

        double soma3 = calc.soma(1,2,3);
        System.out.println(soma3);
    }
}
