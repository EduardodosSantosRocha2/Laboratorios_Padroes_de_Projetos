package com.mycompany.maincafeteria;

public class MainCafeteria {

    public static void main(String[] args) {
        Cafeteria pedido1 = new Espresso();
        Cafeteria macchiatoPedido1 = new Leite(new Chocolate(pedido1));
        Double precoPedido1 = macchiatoPedido1.getCusto();
        String adicionais  = macchiatoPedido1.getDescricao();
        System.out.println(adicionais+" preço: R$"+precoPedido1);
        
        
        
        Cafeteria pedido2 = new Decaf();
        Cafeteria cappuccinoPedido2 = new Leite(new Chocolate(pedido2));
        Double precoPedido2 = cappuccinoPedido2.getCusto();
        String adicionaisPedido2  = cappuccinoPedido2.getDescricao();
        System.out.println(adicionaisPedido2+" preço: R$"+precoPedido2);
        
        
        
        
    }
    
}
