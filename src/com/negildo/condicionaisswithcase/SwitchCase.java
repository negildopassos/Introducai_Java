package com.negildo.condicionaisswithcase;

public class SwitchCase {
    public static void main(String[] args) {



        int diaSemana = 9;

        if (diaSemana == 1){
            System.out.println("Segunda");
        } else if (diaSemana == 2) {
            System.out.println("ter�a");
        }else if (diaSemana == 3) {
            System.out.println("Quarta");
        }else if (diaSemana == 4) {
            System.out.println("Quinta");
        }else if (diaSemana == 5) {
            System.out.println("Sexta");
        }else if (diaSemana == 6) {
            System.out.println("Sabado");
        }else if (diaSemana == 7) {
            System.out.println("Domingo");
        }else {
            System.out.println("Dia da semana invalido");
        }


        switch (diaSemana){
            case 1: System.out.println("Segunda"); break;
            case 2: System.out.println("Ter�a"); break;
            case 3: System.out.println("Quarta");break;
            case 4: System.out.println("Quinta");break;
            case 5: System.out.println("Sexta");break;
            case 6: System.out.println("Sabado");break;
            case 7: System.out.println("Domingo");break;
            default:System.out.println("Dia da semana invalido");
        }

    }
}
