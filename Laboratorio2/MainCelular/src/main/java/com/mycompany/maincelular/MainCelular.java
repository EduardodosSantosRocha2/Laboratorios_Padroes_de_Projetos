/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maincelular;
public class MainCelular {
    public static void main(String[] args) {
        fabricanteCelularSingleton singleton = new fabricanteCelularSingleton();
        fabricanteCelular fabrinteSamsung = singleton.getInstance("samsung");
        
        Celular galaxy8 = fabrinteSamsung.constroiCelular("Galaxy8");
        galaxy8.fazLigacao();
        galaxy8.tiraFoto();
        
        
        Celular galaxy20 = fabrinteSamsung.constroiCelular("Galaxy20");
        galaxy20.fazLigacao();
        galaxy20.tiraFoto();
        
        
        fabricanteCelular fabrinteApple = singleton.getInstance("apple");

        
        Celular iphoneX = fabrinteApple.constroiCelular("IphoneX");
        iphoneX.fazLigacao();
        iphoneX.tiraFoto();
        
        
        Celular iphoneS = fabrinteApple.constroiCelular("IphoneS");
        iphoneS.fazLigacao();
        iphoneS.tiraFoto();
        
        
        
    }
}
