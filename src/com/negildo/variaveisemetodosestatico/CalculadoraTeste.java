package com.negildo.variaveisemetodosestatico;


public class CalculadoraTeste {
       static int soma1;
    public static void main(String[] args) {


        soma1 = Calculadora.soma(1,2);
        System.out.println(soma1);

        int soma2 = Calculadora.soma(1,2,3);
        System.out.println(soma2);

        double soma3 = Calculadora.soma(1,2,3);
        System.out.println(soma3);
    }
}
