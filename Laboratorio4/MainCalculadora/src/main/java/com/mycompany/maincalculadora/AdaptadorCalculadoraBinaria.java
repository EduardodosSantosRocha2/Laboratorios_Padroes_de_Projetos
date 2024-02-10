package com.mycompany.maincalculadora;

public class AdaptadorCalculadoraBinaria implements Calculadora{
    
    private Binaria binaria;
    public AdaptadorCalculadoraBinaria(Binaria binaria) {
        this.binaria = binaria;
    }
    

    @Override
    public String somar(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        int resultado = numA + numB;
        return Integer.toBinaryString(resultado);
    }

    @Override
    public String subtrair(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        int resultado = numA - numB;
        return Integer.toBinaryString(resultado);
    }

    @Override
    public String multiplicar(String a, String b) {
        return "Não possui essa opção!!!";
    }
    
  
}
