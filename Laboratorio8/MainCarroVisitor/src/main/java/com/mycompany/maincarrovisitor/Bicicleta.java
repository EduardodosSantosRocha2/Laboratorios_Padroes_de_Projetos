package com.mycompany.maincarrovisitor;

public class Bicicleta extends Veiculo{

    public Bicicleta(String cor) {
        this.cor = cor;
    }
    
    public String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
