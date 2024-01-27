/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincelular;

/**
 *
 * @author dudur
 */
public class Apple implements fabricanteCelular{

    
    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals("IphoneX")){
            return new IphoneX();
        }else if (modelo.equals("IphoneS")){
            return new IphoneS();
        }
        else{
            return null;
        }
    }
    
}
