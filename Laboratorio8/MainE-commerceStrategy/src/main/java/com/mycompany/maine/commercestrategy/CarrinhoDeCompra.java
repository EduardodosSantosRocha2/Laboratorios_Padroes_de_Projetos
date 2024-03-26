
package com.mycompany.maine.commercestrategy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    List<Item> items = new ArrayList<>();
    List<Item> itemsFrete = new ArrayList<>();
    
    public void adicionaItem(Item item){
        items.add(item);      
    }
    
    public void adicionaFrete(Item item){
        itemsFrete.add(item);      
    }
    
    public void removeItem(Item item){
        items.remove(item);
    }
    
    public void removeFrete(Item item){
        itemsFrete.remove(item);      
    }
    
    public int calculaTotal(){
        int sum = 0;
	for(Item item : items){
            sum += item.getPreco();
        }
	return sum;
    }
    
    public int calculaFrete(){
        int sum = 0;
	for(Item item : itemsFrete){
            sum += item.getPreco();
        }
	return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        int total = this.calculaTotal();
        strategy.pagar(total);   
    }
    
    public void realizaPagamentoFrete(FreteStrategy strategy){
        int total = this.calculaFrete();
        strategy.pagarFrete(total);   
    }
    
    
}
