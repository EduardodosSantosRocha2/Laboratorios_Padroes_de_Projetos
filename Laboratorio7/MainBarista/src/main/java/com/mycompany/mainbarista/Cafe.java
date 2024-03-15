package com.mycompany.mainbarista;

public class Cafe extends BebidaTemplate{

    @Override
    void prepararBebida() {
        System.out.println("Preparando o cafe...");
    }

    @Override
    void adicionaCondimento() {
        System.out.println("Acucar foi adicionado ao cafe...");
        System.out.println("Canela foi adicionado ao cafe...");

    }
    
}
