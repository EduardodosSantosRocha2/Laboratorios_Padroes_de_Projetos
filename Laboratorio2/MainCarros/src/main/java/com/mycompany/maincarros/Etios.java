/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincarros;

public class Etios implements IVehicle{
      @Override
    public void start() {
        System.out.println("O carro Etios ligou");
    }

    @Override
    public void drive() {
        System.out.println("O carro Etios está rodando");
    }

    @Override
    public void stop() {
        System.out.println("O carro Etios parou");
    }
}
