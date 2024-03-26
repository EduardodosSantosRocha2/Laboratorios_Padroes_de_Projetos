package com.mycompany.maincarrovisitor;

public class Carro extends Veiculo{

    public String cor, marca, modelo;

    public String getCor() {
        return cor;
    }

    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
