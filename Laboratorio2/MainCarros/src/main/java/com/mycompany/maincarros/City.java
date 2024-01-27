/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincarros;

/**
 *
 * @author dudur
 */
public class City implements IVehicle{

    @Override
    public void start() {
        System.out.println("O carro City ligou");
    }

    @Override
    public void drive() {
        System.out.println("O carro City está rodando");
    }

    @Override
    public void stop() {
        System.out.println("O carro City parou");
    }
    
}
