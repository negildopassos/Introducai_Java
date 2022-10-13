package com.negildo.classe;

public class CarroTeste {

    public static void main(String[] args) {
        Carro onix = new Carro();

        onix.montadora = "Chevrolet";
        onix.modelo = "Turbo";
        onix.numPassageiros = 5;
        onix.capCombustivel =  90;
        onix.consumoCombustivel = 0.4;


        System.out.println(onix.montadora);
        System.out.println(onix.modelo);
        System.out.println(onix.numPassageiros);
        System.out.println(onix.capCombustivel);
        System.out.println(onix.consumoCombustivel);








        onix.exibirAutonomia();

        double autonomia = onix.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println("A autotonomia do carro é: " +  onix.obterAutonomia());


        double qtdCombustivel = onix.calcularCombustivel(10);

        System.out.println("Quantidade de combustivel : " + qtdCombustivel);



    }
}
