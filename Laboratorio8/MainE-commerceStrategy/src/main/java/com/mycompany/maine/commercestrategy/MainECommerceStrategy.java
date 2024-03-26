/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maine.commercestrategy;

/**
 *
 * @author dudur
 */
public class MainECommerceStrategy {

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        
        carrinho.adicionaItem(new Item("luva", 47) );
        carrinho.adicionaFrete(new Item("Sedex", 123));
        carrinho.adicionaItem(new Item("tenis nike", 389));
        carrinho.adicionaFrete(new Item("Sedex", 23));
        carrinho.adicionaItem(new Item("camiseta adidas", 123));
        carrinho.adicionaFrete(new Item("Sedex", 34));
        
        // supondo que o usuario escolheu pagar com Boleto e FreteSedex
        PagamentoStrategy strategy = new Boleto();
        FreteStrategy strategyFrete = new FreteSedex();
        
        carrinho.realizaPagamento(strategy);
        carrinho.realizaPagamentoFrete(strategyFrete);
        
    }
}
