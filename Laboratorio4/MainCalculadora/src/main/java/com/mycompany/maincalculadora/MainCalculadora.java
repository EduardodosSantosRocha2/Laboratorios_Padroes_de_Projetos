package com.mycompany.maincalculadora;

public class MainCalculadora {

    public static void main(String[] args) {
        
       Decimal dc = new CalculadoraDecimal();
       Calculadora dcCalculadora = new AdaptadorCalculadoraDecimal(dc);
       System.out.println("Soma "+dcCalculadora.somar("2", "3"));
       System.out.println("Subtração: "+ dcCalculadora.subtrair("2", "3"));
       System.out.println("Multiplicação: "+ dcCalculadora.multiplicar("2", "3"));
       
       
       
       
       Binaria bn = new CalculadoraBinaria();
       Calculadora bnCalculadora = new AdaptadorCalculadoraBinaria(bn);
       System.out.println("Soma "+bnCalculadora.somar("2", "3"));
       System.out.println("Subtração: "+ bnCalculadora.subtrair("3", "2"));
    
       
    }
}
