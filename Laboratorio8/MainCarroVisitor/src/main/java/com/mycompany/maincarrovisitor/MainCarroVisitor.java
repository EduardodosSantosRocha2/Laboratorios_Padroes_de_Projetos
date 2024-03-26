package com.mycompany.maincarrovisitor;

public class MainCarroVisitor {

    public static void main(String[] args) {
        Veiculo[] listaVeiculosEstacionados = {
            new Carro("Verde", "Veneno", "Lamborguine"),
            new Onibus(56, 1987),
            new Bicicleta("Verde Agua")
        };

        PrintVisitor visitor = new PrintVisitor();

        for (Veiculo veiculo : listaVeiculosEstacionados) {
            if (veiculo != null) {
                veiculo.accept(visitor);
            }
        }
        
        sendMessageVisitor visitorMesage = new sendMessageVisitor();

        for (Veiculo veiculo : listaVeiculosEstacionados) {
            if (veiculo != null) {
                veiculo.accept(visitorMesage);
            }
        }
        
        
        
    }
}
