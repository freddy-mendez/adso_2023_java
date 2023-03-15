package com.example.data;

public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String parOimpar() {
        return ((valor%2==0)?"Par":"Impar");
    }
    
    public String positivoNegativoOCero() {
        return ((valor<0)?"Negativo":(valor>0?"Positivo":"Cero"));
    }
    
    public boolean esPrimo() {
        boolean flag=false;
        int divisores=0;
        for (int i=1; i<=valor; i++) {
            if (valor%i==0) {
                divisores++;
            }
        }
        if (divisores==2) {
            flag=true;
        }
        return flag;
    }
    
}
