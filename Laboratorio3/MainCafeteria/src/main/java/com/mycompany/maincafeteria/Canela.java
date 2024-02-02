package com.mycompany.maincafeteria;

public class Canela extends CafeteriaDecorator{
    public Canela(Cafeteria cafeteria) {
        super(cafeteria);
    }
    
    @Override
    public String getDescricao(){
        return  super.getDescricao()+ " + adicional de Canela";
    }
    
    @Override
    public Double getCusto(){
        return super.cafeteria.getCusto() +4.00;
    }
}
