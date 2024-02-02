package com.mycompany.maincafeteria;

public class CafeteriaDecorator implements Cafeteria{
    
    protected Cafeteria cafeteria;
    
    public CafeteriaDecorator(Cafeteria cafeteria){
        this.cafeteria = cafeteria;
    }

    @Override
    public String getDescricao() {
        return cafeteria.getDescricao();
    }

    @Override
    public Double getCusto() {
        return cafeteria.getCusto();
    }
    
}
