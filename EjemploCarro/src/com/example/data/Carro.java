package com.example.data;

import java.util.Calendar;
import java.util.Objects;

public class Carro {
    public String placa;
    Calendar fechaEntrada;
    Calendar fechaSalida;
    public boolean estado=true;
    
    public Carro(String placa) {
        this.placa=placa;
        fechaEntrada=Calendar.getInstance();
    }
    
    public void salida() {
        fechaSalida=Calendar.getInstance();
    }
    
    public float valorPagar(float valorHora) {
        return valorHora*numeroHoras();
    }
    
    private int numeroHoras() {
        float diferencia = fechaSalida.getTimeInMillis()-fechaEntrada.getTimeInMillis();
        diferencia=diferencia/1000;
        diferencia=diferencia/60;
        diferencia=diferencia/60;
        if (diferencia>0 && diferencia<1) {
            return 1;
        } else {
            return (int) Math.ceil(diferencia);
        }
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", estado=" + estado + '}';
    }
    
    
    
    
}
