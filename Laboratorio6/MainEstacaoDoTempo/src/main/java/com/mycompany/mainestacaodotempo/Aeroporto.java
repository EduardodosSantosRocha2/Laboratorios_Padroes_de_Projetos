package com.mycompany.mainestacaodotempo;
public class Aeroporto implements Observer{

    @Override
    public void update(double temp, double velocidade, double umidade) {
        System.out.println("Aeroporto foi notificado da mundaça...");
    }
    
}
