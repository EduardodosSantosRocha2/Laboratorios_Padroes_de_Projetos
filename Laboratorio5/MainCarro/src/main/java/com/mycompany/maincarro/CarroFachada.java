package com.mycompany.maincarro;
public class CarroFachada {
    private CintoDeSeguranca cintodeseguranca = new CintoDeSeguranca();
    private Farol farol = new Farol();
    private Motor motor = new Motor();
    private Porta porta = new Porta();
    private Radio radio = new Radio();
    
    
    public void iniciaCorrida(){
        motor.ligar();
        porta.trancarPorta();
        cintodeseguranca.travarCintoDeSeguranca();
        farol.acenderFarol();
        radio.ligar();
        radio.sintonizar("96,7");
    }
    
    public void finalizaCorrida(){
        motor.desligar();
        porta.destrancarPorta();
        cintodeseguranca.destravarCintoDeSeguranca();
        farol.apagarFarol();
        radio.desligar();
    }
}
