package com.mycompany.mainpizzaria;

public class Ovo extends PizzaDecorator{
    
    public Ovo(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public String getDescricao(){
        return  super.getDescricao()+ " + adicional de ovo";
    }
    
    @Override
    public Double getCusto(){
        return super.pizza.getCusto() +4.00;
    }
    
}
