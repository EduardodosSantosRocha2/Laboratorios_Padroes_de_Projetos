package com.mycompany.maincafeteria;

public class Chocolate extends CafeteriaDecorator{
    
    public Chocolate(Cafeteria cafeteria) {
        super(cafeteria);
    }
    
    @Override
    public String getDescricao(){
        return  super.getDescricao()+ " + adicional de Chocolate";
    }
    
    @Override
    public Double getCusto(){
        return super.cafeteria.getCusto() +6.00;
    }
    
}
