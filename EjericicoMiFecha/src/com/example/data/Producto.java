package com.example.data;

public class Producto {
    public MiFecha vence=new MiFecha();

    /*public Producto(MiFecha vence) {
        this.vence=vence;
    }*/
    
    

    @Override
    public String toString() {
        return "Producto{" + "vence=" + vence + '}';
    }
    
    
}
