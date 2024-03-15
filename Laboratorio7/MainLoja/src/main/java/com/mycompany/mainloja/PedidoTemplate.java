package com.mycompany.mainloja;

abstract class PedidoTemplate {
    
    int quantidadeItens;
    double valorUnitario;
    String formaPagamento;
    

    public PedidoTemplate(int quantidadeItens, double valorUnitario, String formaPagamento) {
        this.valorUnitario = valorUnitario;
        this.quantidadeItens = quantidadeItens;
        this.formaPagamento = formaPagamento;
    }
    
    
    
    abstract void processarPagamento();
    
    abstract void decidirEntrega();
    
    protected void realizarEntrega() {
        System.out.println("O seu pedido foi entregue!");
    }
    
    public void ProcessarPedido(){
        processarPagamento();
        decidirEntrega();
        realizarEntrega();
        
    }
    
}
