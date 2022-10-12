package com.negildo.arrays;

public class Array {
    public static void main(String[] args) {

        double tempDia001 = 32.1;
        double tempDia002 = 30.1;
        double tempDia003 = 28.1;

        double [] temperaturas = new double[365];


        temperaturas[0] = tempDia001;
        temperaturas[1] = tempDia002;
        temperaturas[2] = tempDia003;

        System.out.println("O Valor da temperatura do dia 1 é: " + temperaturas[0]);
        System.out.println("O Valor da temperatura do dia 2 é: " + temperaturas[1]);
        System.out.println("O Valor da temperatura do dia 3 é: " + temperaturas[2]);

        System.out.println("O tamanho do array é : " + temperaturas.length);

        for (int i = 0; i<temperaturas.length; i++){
            System.out.println("Os valores da temperatura são: "  + temperaturas[i]);
        }


        for (double temp : temperaturas){
            System.out.println(temp);
        }



    }
}
