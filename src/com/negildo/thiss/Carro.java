package com.negildo.thiss;

public class Carro {

    String montadora;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String montadora, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.montadora = montadora;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    void exibirAutonomia(){

        System.out.println("A autonomia do carro ? : " + capCombustivel*consumoCombustivel + " km");
    }

    double obterAutonomia(){
        return capCombustivel*consumoCombustivel;
    }


    double calcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }



}

