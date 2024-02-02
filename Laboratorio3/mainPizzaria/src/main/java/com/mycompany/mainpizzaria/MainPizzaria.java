package com.mycompany.mainpizzaria;


public class MainPizzaria {

    public static void main(String[] args) {
        Pizza pedido1 = new MassaFinaPizza();
        Pizza margueritaPedido1 = new Queijo(new Tomate(pedido1));
        Double precoPedido1 = margueritaPedido1.getCusto();
        String adicionais  = margueritaPedido1.getDescricao();
        System.out.println(adicionais+" preço: R$"+precoPedido1);
        
        
    }
}
