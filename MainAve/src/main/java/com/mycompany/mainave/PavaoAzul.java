package com.mycompany.mainave;

public class PavaoAzul implements Pavao{

    @Override
    public void cantar() {
        System.out.println("O Pavao Azul está cantando");
    }

    @Override
    public void voar() {
        System.out.println("O Pavao Azul pavão não sabe voar");
    }  
    
}
