package com.mycompany.mainmercadofinanceiro;

public interface Subject {
    public void addObserver(Observer observador);
    public void removeObserver(Observer observador);
    public void notifyObserver();
    public void setNovoPreco(double novoPreco);
}
