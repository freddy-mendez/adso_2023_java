package com.example.data;

import java.util.ArrayList;

public class Ficha {
    private int numero;
    private String programa;
    private ArrayList<Aprendiz> aprendices;

    public Ficha(int numero, String programa) {
        this.numero = numero;
        this.programa = programa;
        this.aprendices=new ArrayList();
    }

     

    public ArrayList<Aprendiz> getAprendices() {
        return aprendices;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Ficha{" + "numero=" + numero + ", programa=" + programa + '}';
    }
    
    
    
}
