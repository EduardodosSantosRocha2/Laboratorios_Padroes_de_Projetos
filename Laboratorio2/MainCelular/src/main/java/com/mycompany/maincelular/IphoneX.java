/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincelular;

/**
 *
 * @author dudur
 */
public class IphoneX implements Celular{

     @Override
    public void fazLigacao() {
        System.out.println("IphoneX ligou para o contato");
    }

    @Override
    public void tiraFoto() {
        System.out.println("IphoneX Tik, Tik, olha a foto ");
    }
    
}
