/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maine.commercestrategy;

/**
 *
 * @author dudur
 */
public class Cartao implements PagamentoStrategy{
    @Override
    public void pagar(int total) {
        System.out.println("Pagamento via R$: "+total);
    }
}
