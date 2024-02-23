package com.mycompany.maincarro;

public class Radio {
    public void ligar(){
        System.out.println("O radio foi ligado");
    }
    
    public void desligar(){
        System.out.println("O radio foi desligado");
    }
    
    public void sintonizar(String estacao){
        System.out.println("O radio foi sintonizado na estação: "+estacao);
    }
}
