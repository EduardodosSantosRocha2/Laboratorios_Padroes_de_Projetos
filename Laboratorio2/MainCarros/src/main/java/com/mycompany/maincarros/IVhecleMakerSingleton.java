
package com.mycompany.maincarros;

public class IVhecleMakerSingleton {
    //Foi escolhido o padrão Singleton pois ele é um design pattern que garante uma unica instancia e economiza memoria
    private static Toyota toyota;
    private static Honda honda;
    
    public static IVehicleMaker getInstance(String fabricante){
        if(fabricante.equals("Toyota")){
            if(toyota == null){
                toyota =  new Toyota();
            }
            return toyota;
            
        }else{
            if(honda == null){
                honda =  new Honda();
            }
            return honda;
        }
    } 
}
