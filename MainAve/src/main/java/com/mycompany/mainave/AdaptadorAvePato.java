package com.mycompany.mainave;

public class AdaptadorAvePato implements Ave{
    private Pato pato;
    
   public AdaptadorAvePato(Pato pato){
        this.pato = pato;
    }

    @Override
    public void EmitirSom() {
        pato.grasnar();
    }

    @Override
    public void Voar() {
        pato.voar();
    }

  
    
    
}
