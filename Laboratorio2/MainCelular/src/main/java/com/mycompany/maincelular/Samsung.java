/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincelular;


public class Samsung implements fabricanteCelular{

    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals("Galaxy8")){
            return new Galaxy8();
        }else if(modelo.equals("Galaxy20")){
            return new Galaxy20();
        }
        else{
            return null;
        }
    }
    
}
