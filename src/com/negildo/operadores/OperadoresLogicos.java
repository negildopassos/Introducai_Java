package com.negildo.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 2;


        boolean resultado1 = (valor1 == 1) && (valor2 ==2);
        System.out.println("Valor1 � 1 AND valor2 � 2 - resultado: " +resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 ==2);
        System.out.println("Valor1 � 1 OR valor2 � 2 - resultado: " +resultado2);
    }
}
