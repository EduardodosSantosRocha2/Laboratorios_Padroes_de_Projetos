package com.mycompany.maindinossauro;

public class AdaptadorDinossauroTiranossaurosRex implements Dinossauro{

    TiranossauroRex tiranossaurosRex;
    public AdaptadorDinossauroTiranossaurosRex(TiranossauroRex tiranossaurosRex){
        this.tiranossaurosRex = tiranossaurosRex;
    }
    
    @Override
    public void calcularQuantidadeAlimento(float pesoAnimal, float alturaAnimal) {
        tiranossaurosRex.calcularQuantidadeCarne(pesoAnimal, alturaAnimal);
    }

    @Override
    public void comer() {
        tiranossaurosRex.comerCarne();
    }

    @Override
    public void beberAgua() {
        tiranossaurosRex.beberAgua();
    }
    
}
