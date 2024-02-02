package com.mycompany.mainpizzaria;

public class Tomate extends PizzaDecorator{
    
    public Tomate(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public String getDescricao(){
        return  super.getDescricao()+ " + adicional de tomate";
    }
    
    @Override
    public Double getCusto(){
        return super.pizza.getCusto() +7.00;
    }
    
    
}
