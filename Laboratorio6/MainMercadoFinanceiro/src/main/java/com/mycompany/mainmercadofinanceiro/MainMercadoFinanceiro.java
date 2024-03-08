package com.mycompany.mainmercadofinanceiro;
public class MainMercadoFinanceiro {

    public static void main(String[] args) {
        Subject ac = new Acao();
        AcaoBroker broker = new AcaoBroker();
        Observer investidor1 = new Investidor("investidor1",99.00, 20.00, broker);
        ac.addObserver(investidor1);
        
        System.out.println("------------\n");
        ac.setNovoPreco(190.00); //Ação vendida
        System.out.println("------------\n");
        ac.setNovoPreco(19.00); //Ação comprada
        System.out.println("------------\n");
        ac.setNovoPreco(65.00); //Ação sem nenhuma alteração
        System.out.println("------------\n");   
    }
}
