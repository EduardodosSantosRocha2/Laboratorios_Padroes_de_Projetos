/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincelular;

public class IphoneS implements Celular{

    @Override
    public void fazLigacao() {
        System.out.println("IphoneS ligou para o contato");
    }

    @Override
    public void tiraFoto() {
        System.out.println("IphoneS Tik, Tik, olha a foto ");
    }
    
}
