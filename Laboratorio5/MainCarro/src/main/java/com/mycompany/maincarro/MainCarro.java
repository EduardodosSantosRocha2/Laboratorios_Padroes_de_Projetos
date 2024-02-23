package com.mycompany.maincarro;
public class MainCarro {

    public static void main(String[] args) {
        CarroFachada carroFachada = new CarroFachada();
        System.out.println("-----------Inicio corrida-----------");
        carroFachada.iniciaCorrida();
        System.out.println("-----------Fim corrida-----------");
        carroFachada.finalizaCorrida();
    }
}
