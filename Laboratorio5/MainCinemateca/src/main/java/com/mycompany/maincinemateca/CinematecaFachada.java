package com.mycompany.maincinemateca;
public class CinematecaFachada {
    
    
    private MaquinaPipoca maquinapipoca = new MaquinaPipoca();
    private Projetor projetor = new Projetor();
    private Amplificador amplificador = new Amplificador();
    private Luzes luzes = new Luzes();
    private StremingPlayer stremingplayer = new StremingPlayer();
    private Telao telao = new Telao();
    
    
    
    
    
    
    
    public void iniciaFilme(){
        maquinapipoca.ligar();
        maquinapipoca.arrebentaPipoca();
        luzes.desligaLuz();
        telao.abaixaTelao();
        projetor.ligar();
        amplificador.ligar();
        amplificador.ajustarVolume(10);
        stremingplayer.ligar();
        stremingplayer.play("Rio3");
    }
    
    public void fimDoFilme(){
        maquinapipoca.desliga();
        luzes.desligaLuz();
        telao.sobeTelao();
        projetor.desliga();
        amplificador.desligar();
        stremingplayer.desligar();
    }
    
    
    
}
