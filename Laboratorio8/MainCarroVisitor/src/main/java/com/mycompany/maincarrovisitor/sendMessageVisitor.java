package com.mycompany.maincarrovisitor;

public class sendMessageVisitor implements Visitor{

    @Override
    public void visit(Carro c) {
        System.out.println("Favor atualizar dados do IPVA dono do carro "+c.marca+" de modelo "+c.modelo+" e cor "+c.cor);
        System.out.println("-------------------------------------------------------");
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("Atenção para atualização das licenças do onibus de "+o.lugares+" lugares e ano "+o.anoFabricacao);
        System.out.println("-------------------------------------------------------");
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.println("Comemore no parque o dia do ciclismo dono da bicicleta "+b.getCor());
        System.out.println("-------------------------------------------------------");
    }
    
}
