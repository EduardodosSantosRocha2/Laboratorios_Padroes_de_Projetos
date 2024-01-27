/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.maincarros;

public interface IVehicleMaker {
    //Foi escolhido o padrão Factory pois ele é uma maneira de criar objetos de maneira flexivel e de facil manutenção, portanto, podemos fazer a analogia com o exemplo do UDP e TCP
    public IVehicle makeVehicle(String modelo);
}
