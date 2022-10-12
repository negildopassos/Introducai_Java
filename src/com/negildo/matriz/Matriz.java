package com.negildo.matriz;

public class Matriz {
    public static void main(String[] args) {

        double [] [] notasAlunos = new double[30][4];


        notasAlunos [0] [0] = 10;
        notasAlunos [0] [1] = 9;
        notasAlunos [0] [2] = 7;
        notasAlunos [0] [3] = 8;


        notasAlunos [1] [0] = 5;
        notasAlunos [1] [1] = 9;
        notasAlunos [1] [2] = 6;
        notasAlunos [1] [3] = 8;


        notasAlunos [2] [0] = 9;
        notasAlunos [2] [1] = 7;
        notasAlunos [2] [2] = 7;
        notasAlunos [2] [3] = 6;



        System.out.println(notasAlunos[1][2]);
    }
}
