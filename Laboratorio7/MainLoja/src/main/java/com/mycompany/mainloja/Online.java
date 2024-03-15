package com.mycompany.mainloja;

public class Online extends PedidoTemplate{

    public Online(int quantidadeItens, double valorUnitario, String formaPagamento) {
        super(quantidadeItens, valorUnitario, formaPagamento);
    }

    @Override
    void processarPagamento() {
        System.out.println("Pagamento "+formaPagamento+" de quantidade "+quantidadeItens+" e valor unitario R$ "+valorUnitario);
    }

    @Override
    void decidirEntrega() {
        System.out.println("Existe entrega");
    }
    
}
