/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincarros;

public class Honda implements IVehicleMaker{
    //Foi escolhido o padrão Factory pois ele é uma maneira de criar objetos de maneira flexivel e de facil manutenção, portanto, podemos fazer a analogia com o exemplo do UDP e TCP

    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals("City")){
            return new City();
        }        
        else if (modelo.equals("Civic")){
            return new Civic();
        }        
        else if(modelo.equals("Fit")){
            return new Fit();
        }        
        else{
            return null;
        }
    }
    
}
