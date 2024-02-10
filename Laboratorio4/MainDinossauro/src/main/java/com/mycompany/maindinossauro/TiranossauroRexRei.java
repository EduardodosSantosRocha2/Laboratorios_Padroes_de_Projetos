
package com.mycompany.maindinossauro;

public class TiranossauroRexRei implements TiranossauroRex{

    @Override
    public void calcularQuantidadeCarne(float pesoAnimal, float alturaAnimal) {
        System.out.println("Quantidade de Carne: "+ (float) ((pesoAnimal * alturaAnimal) *2.5));
    }

    @Override
    public void comerCarne() {
        System.out.println("O Tiranossauros Rex Rei está comendo sua carninha!");
    }

    @Override
    public void beberAgua() {
        System.out.println("O Tiranossauros Rex Rei está bebendo sua aguinha!");
    }
    
}
