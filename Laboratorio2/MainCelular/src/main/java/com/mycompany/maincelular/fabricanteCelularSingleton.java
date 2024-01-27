/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincelular;

public class fabricanteCelularSingleton {
    
    private static Samsung samsung;
    
    private  static Apple apple;
    
    public static fabricanteCelular getInstance(String fabricante){       
         if(fabricante.equals("apple")){
             if(apple == null){
                 apple = new Apple();
             }
             return apple;
         }
         
         else{
             if(samsung == null){
                 samsung = new Samsung();
             }
             return samsung;
         }
       
    
    }


}
