package com.negildo.foreach;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {


        double [] notas =  new double[10];

        Random random = new Random();

        for (int i = 0; i<notas.length; i++){
            notas[i] = random.nextDouble(10);
        }

        for (int i = 0; i<notas.length;i++){
            System.out.println(notas[i]);
        }
            System.out.println("Usando o For Each");


        for(double nota : notas){
            System.out.println(nota);
        }
    }
}
