package com.example.data;

public class Servicios {

    public static void add(double factura_servicio) {
        
    }
    private int codigo;
    private String nombre;
    private int estrato;
    private int consumo;

    public Servicios(int codigo, String nombre, int estrato, int consumo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estrato = estrato;
        this.consumo = consumo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    public double setfactura_servicio(){
        double tarifaBasica=0;
        switch (this.estrato){
            case 1: tarifaBasica=10000;break;
            case 2: tarifaBasica=15000;break;
            case 3: tarifaBasica=20000;break;
            case 4: tarifaBasica=25000;break;
            case 5: tarifaBasica=30000;break;
        
        }
        
        return tarifaBasica+(consumo*100);
        
        
                
}

    @Override
    public String toString() {
        return "Servicios{" + "codigo=" + codigo + ", nombre=" + nombre + ", estrato=" + estrato + ", consumo=" + consumo + '}';
    }
}
        
    

