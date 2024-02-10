package com.mycompany.maindinossauro;

public class MainDinossauro {

    public static void main(String[] args) {
        
        TiranossauroRex TiranossauroRex1 = new TiranossauroRexRei();
        Dinossauro TiranossauroRex1Dinossauro = new AdaptadorDinossauroTiranossaurosRex(TiranossauroRex1);
        TiranossauroRex1Dinossauro.calcularQuantidadeAlimento(2, 3);
        TiranossauroRex1Dinossauro.comer();
        TiranossauroRex1Dinossauro.beberAgua();
        
        
        
        Braquiossauro Braquiossauro1 = new BraquiossauroAlpha();
        Dinossauro Braquiossauro1Dinossauro = new AdaptadorDinossauroBraquiossauro(Braquiossauro1);
        Braquiossauro1Dinossauro.calcularQuantidadeAlimento(6, 4);
        Braquiossauro1Dinossauro.comer();
        Braquiossauro1Dinossauro.beberAgua();
        
    }
}
