
package com.mycompany.mainmercadofinanceiro;
public class Investidor implements Observer{

 
    private String nomeInvestidor;
    private double precoMax;
    private double precoMin;
    private AcaoBroker broker;

    public Investidor(String nomeInvestidor,double precoMax, double precoMin, AcaoBroker broker) {
        this.nomeInvestidor = nomeInvestidor;
        this.precoMax = precoMax;
        this.precoMin = precoMin;
        this.broker = broker;
    }

    @Override
    public void update(double novoPreco) {
        if (novoPreco >= precoMax) {
            broker.vender(nomeInvestidor);
        } else if (novoPreco <= precoMin) {
            broker.comprar(nomeInvestidor);
       }   
        else{
            broker.semAcao(nomeInvestidor);
        }
    }
    
}
