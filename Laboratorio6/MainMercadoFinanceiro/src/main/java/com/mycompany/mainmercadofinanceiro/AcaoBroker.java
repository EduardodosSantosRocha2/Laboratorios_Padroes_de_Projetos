
package com.mycompany.mainmercadofinanceiro;

public class AcaoBroker implements interfaceBroker{

    @Override
    public void vender(String nomeInvestidor) {
        System.out.println("Ação vendida pelo investidor: " +nomeInvestidor );
    }
    @Override
    public void comprar(String nomeInvestidor) {
        System.out.println("Ação comprada pelo investidor: " +nomeInvestidor );
    }
    
    public void semAcao(String nomeInvestidor) {
        System.out.println("Nenhuma ação tomada:");
    }
 
}
