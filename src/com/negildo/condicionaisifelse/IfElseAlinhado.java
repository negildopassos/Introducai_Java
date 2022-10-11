package com.negildo.condicionaisifelse;

public class IfElseAlinhado {

    public static void main(String[] args) {
        //IMC
        //baixo peso - <= 18,5
        //peso ideal  -  >= 18.6 e <=24,9
        //obeso - >30


        double peso = 84;
        double altura = 1.76;
        double imc = peso/(altura*2);
        System.out.println(imc);

        if (imc <=18.5){
            System.out.println("Você esta abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Você esta com peso ideal");
        }else if (imc>=30){
            System.out.println("Você esta obeso");
        }

    }
}
