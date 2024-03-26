package com.mycompany.maine.commercestrategy;

public class FreteNormal implements FreteStrategy{
    @Override
    public void pagarFrete(int totalFrete) {
        System.out.println("Frete Normal de valor: R$ "+totalFrete);
    }
}
