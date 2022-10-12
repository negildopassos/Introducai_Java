package com.negildo.breakcontinue;

public class BreakContinue {

    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 21;

        for (int i = valor1; i<valor2; i++){
            if (i % 7 == 0){
                System.out.println("O Valor de i é: " + i);
                break;
            }
        }
    }
}
