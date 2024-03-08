package com.mycompany.mainmercadofinanceiro;

import java.util.ArrayList;
import java.util.List;

public class Acao implements Subject{
    
    
    private List<Observer> observadores;
    private double novoPreco;

    public Acao() {
        observadores = new ArrayList<Observer>();
    }
    
    
    @Override
    public void addObserver(Observer observador) {
        observadores.add(observador);
    }
    
    @Override
    public void removeObserver(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observadores){
            o.update(novoPreco);
        }
    }
   public double getNovoPreco() {
        return novoPreco;
    }

    public void setNovoPreco(double novoPreco) {
        this.novoPreco = novoPreco;
        notifyObserver();
    }

}
