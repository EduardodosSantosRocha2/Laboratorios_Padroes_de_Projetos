package com.mycompany.maincafeteria;

public class Leite extends CafeteriaDecorator{
    
    public Leite(Cafeteria cafeteria) {
        super(cafeteria);
    }
    
    @Override
    public String getDescricao(){
        return  super.getDescricao()+ " + adicional de Leite";
    }
    
    @Override
    public Double getCusto(){
        return super.cafeteria.getCusto() +2.00;
    }
    
}
