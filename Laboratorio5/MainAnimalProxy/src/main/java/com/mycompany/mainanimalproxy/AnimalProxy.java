package com.mycompany.mainanimalproxy;
public class AnimalProxy implements Animal{
    private AnimalReal animalReal;
    private String nome;

    public AnimalProxy(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarInfo() {
        if (animalReal == null) {
            animalReal = new AnimalReal(nome, "Desconhecido");
        }
        animalReal.mostrarInfo();
    }

}
