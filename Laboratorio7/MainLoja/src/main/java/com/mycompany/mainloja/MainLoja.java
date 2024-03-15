package com.mycompany.mainloja;
public class MainLoja {

    public static void main(String[] args) {
        System.out.println("-------------------Online-------------------");
        PedidoTemplate online = new Online(1,2.5,"Online");
        online.ProcessarPedido();
        
        System.out.println("-------------------Na Loja-------------------");
        PedidoTemplate naloja = new NaLoja(4,4.1,"Na Loja");
        naloja.ProcessarPedido();
        
        System.out.println("-------------------Criptomoeda-------------------");
        PedidoTemplate criptomoeda = new Criptomoeda(7,5.5,"Criptomoeda");
        criptomoeda.ProcessarPedido();
        
    }
}
