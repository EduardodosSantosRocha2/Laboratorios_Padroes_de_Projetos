package com.mycompany.maincalculadora;

public class CalculadoraBinaria implements Binaria{

    @Override
    public String somar(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int resultado = numA + numB;
        return Integer.toBinaryString(resultado);
    }

    @Override
    public String subtrair(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int resultado = numA - numB;
        return Integer.toBinaryString(resultado);
    }
    
}
