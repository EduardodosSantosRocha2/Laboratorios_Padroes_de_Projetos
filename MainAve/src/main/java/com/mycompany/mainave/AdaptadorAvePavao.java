package com.mycompany.mainave;

public class AdaptadorAvePavao implements Ave{
 
   public Pavao pavao;
    
   public AdaptadorAvePavao(Pavao pavao){
        this.pavao = pavao;
    }

    @Override
    public void EmitirSom() {
        pavao.cantar();
    }

    @Override
    public void Voar() {
        System.out.println("Pavao não sabe voar");
    }

    

   
    
}
 

