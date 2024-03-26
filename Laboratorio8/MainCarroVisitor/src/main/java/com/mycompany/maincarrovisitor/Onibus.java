/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincarrovisitor;

public class Onibus extends Veiculo{

    public int lugares;
    public int anoFabricacao;

    public Onibus(int lugares, int anoFabricacao) {
        this.lugares = lugares;
        this.anoFabricacao = anoFabricacao;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
