package com.mycompany.maincinemateca;
public class MainCinemateca {

    public static void main(String[] args) {
        CinematecaFachada   hometheaterfachada  = new  CinematecaFachada ();
        System.out.print("-------Inicio do Filme-------\n");
        hometheaterfachada.iniciaFilme();
        System.out.print("-------Fim do Filme-------\n");
        hometheaterfachada.fimDoFilme();
    }
}
