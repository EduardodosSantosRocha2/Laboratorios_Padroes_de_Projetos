
package com.mycompany.maincarrovisitor;

public class PrintVisitor implements Visitor{

    @Override
    public void visit(Carro c) {
        System.out.println("Dados do Carro:");
        System.out.println("Cor: " + c.getCor());
        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("-------------------------------------------------------");
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("Dados do Onibus:");
        System.out.println("Quantidade de lugares: " + o.getLugares());
        System.out.println("Ano de fabricação: " + o.getAnoFabricacao());
        System.out.println("-------------------------------------------------------");
    }

    @Override
    public void visit(Bicicleta b) {
         System.out.println("Dados da Bicicleta:");
         System.out.println("Cor: " + b.getCor());
         System.out.println("-------------------------------------------------------");
    }

}
