package com.mycompany.mainbarista;

public class Capuccino extends BebidaTemplate{

    @Override
    void prepararBebida() {
        System.out.println("Preparando o Capuccino");
    }

    @Override
    void adicionaCondimento() {
        System.out.println("Foi adicionado leite ao cafe");
    }
    
}
