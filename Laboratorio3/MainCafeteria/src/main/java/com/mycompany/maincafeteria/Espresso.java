package com.mycompany.maincafeteria;

public class Espresso implements Cafeteria{
    
    @Override
    public String getDescricao() {
        return "Café Espresso";
    }

    @Override
    public Double getCusto() {
        return 12.0;
    }
    
}
