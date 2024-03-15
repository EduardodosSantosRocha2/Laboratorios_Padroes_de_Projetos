package com.mycompany.mainbarista;

public class MainBarista {

    public static void main(String[] args) {
        
        System.out.println("----------------------------Cafe----------------------------");
        
        BebidaTemplate cafe = new Cafe();
        cafe.preparaComanda();
        
        System.out.println("----------------------------Capuccino----------------------------");
        
        BebidaTemplate capuccino = new Capuccino();
        capuccino.preparaComanda();
        
        
        System.out.println("----------------------------Cha----------------------------");
        
        BebidaTemplate cha = new Cha();
        cha.preparaComanda();

    }
}
