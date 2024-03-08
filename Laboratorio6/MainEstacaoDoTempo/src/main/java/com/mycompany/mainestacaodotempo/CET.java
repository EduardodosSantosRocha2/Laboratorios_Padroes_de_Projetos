package com.mycompany.mainestacaodotempo;

import java.util.ArrayList;
import java.util.List;
public class CET implements Subject{
    
    private List<Observer> observadores;
    private double temperatura, umidade, velocidade;
    
    public CET(){
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
            o.update(temperatura, umidade, velocidade);
        }
    }

    public List<Observer> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observer> observadores) {
        this.observadores = observadores;
         notifyObserver();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notifyObserver();
    }

    public double getUmidade() {
        return umidade;
    }

    @Override
    public void setUmidade(double umidade) {
        this.umidade = umidade;
         notifyObserver();
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
         notifyObserver();
    }
     
}
