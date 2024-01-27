/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maincarros;

public class MainCarros {

    public static void main(String[] args) {
        //Foi escolhido o padrão Factory pois ele é uma maneira de criar objetos de maneira flexivel e de facil manutenção, portanto, podemos fazer a analogia com o exemplo do UDP e TCP
        //Foi escolhido o padrão Singleton pois ele é um design pattern que garante uma unica instancia e economiza memoria    
        IVhecleMakerSingleton singleton = new IVhecleMakerSingleton();
        IVehicleMaker fabricanteHonda = singleton.getInstance("Honda");
        
        IVehicle city = fabricanteHonda.makeVehicle("City");
        city.start();
        city.drive();
        city.stop();
        
        
        IVehicle civic = fabricanteHonda.makeVehicle("Civic");
        civic.start();
        civic.drive();
        civic.stop();
        
        IVehicle fit = fabricanteHonda.makeVehicle("Fit");
        fit.start();
        fit.drive();
        fit.stop();
        
        
        
        IVehicleMaker fabricanteToyota = singleton.getInstance("Toyota");
        
        IVehicle corolla = fabricanteToyota.makeVehicle("Corolla");
        corolla.start();
        corolla.drive();
        corolla.stop();
        
        
        IVehicle hilux = fabricanteToyota.makeVehicle("Hilux");
        hilux.start();
        hilux.drive();
        hilux.stop();
        
        IVehicle etios = fabricanteToyota.makeVehicle("Etios");
        etios.start();
        etios.drive();
        etios.stop();
        
    }
}
