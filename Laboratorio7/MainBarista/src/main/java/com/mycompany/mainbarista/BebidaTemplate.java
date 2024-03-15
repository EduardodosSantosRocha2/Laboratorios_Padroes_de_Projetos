package com.mycompany.mainbarista;

abstract class BebidaTemplate {
  
    public BebidaTemplate() {
        
    }
    
    public void aquecerAgua(){
        System.out.println("Aquecendo agua...");
    }
    
    abstract void prepararBebida();

    public void colocaXicara(){
        System.out.println("Colocando na Xicara...");
    }
    
    abstract void adicionaCondimento();
    
    public void preparaComanda(){
        aquecerAgua();
        prepararBebida();
        colocaXicara();
        adicionaCondimento();
        
    }
   
}
