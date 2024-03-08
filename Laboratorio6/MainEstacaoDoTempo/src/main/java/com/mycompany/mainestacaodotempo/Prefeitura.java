package com.mycompany.mainestacaodotempo;
public class Prefeitura implements Observer{

    @Override
    public void update(double temp, double velocidade, double umidade) {
        System.out.println("Prefeitura foi notificado da mundaça...");

    }
    
}
