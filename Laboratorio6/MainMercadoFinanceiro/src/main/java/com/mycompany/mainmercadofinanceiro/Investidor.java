
package com.mycompany.mainmercadofinanceiro;
public class Investidor implements Observer{

    
    @Override
    public void update(double novoPreco) {
        
        System.out.println("A ação atingiu o preço máximo, portanto foi vendida!");
    }
    
}
