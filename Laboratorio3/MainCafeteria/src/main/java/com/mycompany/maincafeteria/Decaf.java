package com.mycompany.maincafeteria;

public class Decaf implements Cafeteria{
    
    @Override
    public String getDescricao() {
        return "Café descafeinado";
    }

    @Override
    public Double getCusto() {
        return 10.0;
    }
}
