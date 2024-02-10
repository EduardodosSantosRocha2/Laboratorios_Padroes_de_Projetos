package com.mycompany.mainave;
public class MainAve {

    public static void main(String[] args) {
        
        Pato patoDomestico = new PatoDomestico();
        Ave patoUniversal = new AdaptadorAvePato(patoDomestico);
        patoUniversal.EmitirSom();
        patoUniversal.Voar();
        
        
        
        
        Pavao pavaoAzul = new PavaoAzul();
        Ave pavaoUniversal = new AdaptadorAvePavao(pavaoAzul);
        pavaoUniversal.EmitirSom();
        pavaoUniversal.Voar();
        
        
    }
}
