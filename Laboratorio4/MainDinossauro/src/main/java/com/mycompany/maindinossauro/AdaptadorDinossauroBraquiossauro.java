package com.mycompany.maindinossauro;

public class AdaptadorDinossauroBraquiossauro implements Dinossauro{
    Braquiossauro braquiosauro;
    public AdaptadorDinossauroBraquiossauro(Braquiossauro braquiosauro){
        this.braquiosauro = braquiosauro;
    }

    @Override
    public void calcularQuantidadeAlimento(float pesoAnimal, float alturaAnimal) {
        braquiosauro.calcularQuantidadePlanta(pesoAnimal, alturaAnimal);
    }

    @Override
    public void comer() {
        braquiosauro.comerPlanta();
    }

    @Override
    public void beberAgua() {
        braquiosauro.beberAgua();
    }
}
