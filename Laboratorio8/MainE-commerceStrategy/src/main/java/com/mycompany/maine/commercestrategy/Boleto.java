
package com.mycompany.maine.commercestrategy;

public class Boleto implements PagamentoStrategy{
    @Override
    public void pagar(int total) {
        System.out.println("Pagamento via boleto R$: "+total);
    }
}
