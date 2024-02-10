
package com.mycompany.maindinossauro;

public class BraquiossauroAlpha implements Braquiossauro{

    @Override
    public void calcularQuantidadePlanta(float pesoAnimal, float alturaAnimal) {
       System.out.println("Quantidade de Planta: "+  (pesoAnimal * alturaAnimal));
    }

    @Override
    public void comerPlanta() {
        System.out.println("O Braquiossauro Alpha está comendo sua plantinha!");
    }

    @Override
    public void beberAgua() {
        System.out.println("O Braquiossauro Alpha Rei está bebendo sua aguinha!");
    }
    
}
