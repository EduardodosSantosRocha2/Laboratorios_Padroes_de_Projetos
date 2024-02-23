package com.mycompany.mainanimalproxy;
public class AnimalReal implements Animal{
    private String nome;
    private String habitat;

    public AnimalReal(String nome, String habitat) {
        this.nome = nome;
        this.habitat = habitat;
        System.out.println(nome + " O habitat está sendo criado e pode levar um tempo...");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Habitat: " + habitat);
    }
}
