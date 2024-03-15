package com.mycompany.mainbarista;
public class Cha extends BebidaTemplate {

    @Override
    void prepararBebida() {
        System.out.println("Preparando o cha");
    }

    @Override
    void adicionaCondimento() {
        System.out.println("Foi adicionado erva ao cha");
    }
    
}
