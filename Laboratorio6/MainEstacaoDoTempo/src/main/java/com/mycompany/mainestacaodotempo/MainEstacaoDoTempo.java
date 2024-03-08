package com.mycompany.mainestacaodotempo;

public class MainEstacaoDoTempo {

    public static void main(String[] args) {
        
        Subject cet = new CET();
        Observer prefeitura = new Prefeitura();
        cet.addObserver(prefeitura);
        Observer aeroporto = new Aeroporto();
        cet.addObserver(aeroporto);
        
        cet.setUmidade(30);
        cet.setUmidade(60);

        
        
        
    }
}
