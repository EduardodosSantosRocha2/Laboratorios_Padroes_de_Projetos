package com.mycompany.mainestacaodotempo;

public interface Subject {
    
    public void addObserver(Observer observador);
    public void removeObserver(Observer observador);
    public void notifyObserver();
    public void setUmidade(double umidade);

}
