package com.mycompany.maine.commercestrategy;

public class FreteSedex implements FreteStrategy{

    @Override
    public void pagarFrete(int totalFrete) {
        System.out.println("Frete via Sedex de valor: R$ "+totalFrete);
    }
    
}
