package com.example.data;

import java.util.Calendar;

public class MiFecha {
    private int dia=1;
    private int mes=1;
    private int anio=2000;
    
    public MiFecha(int dia, int mes, int anio) {
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public MiFecha() {
        Calendar calendar = Calendar.getInstance();
        this.dia=calendar.get(Calendar.DAY_OF_MONTH);
        this.mes=calendar.get(Calendar.MONTH)+1;
        this.anio=calendar.get(Calendar.YEAR);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiFecha other = (MiFecha) obj;
        if (this.dia != other.dia) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        return this.anio == other.anio;
    }
    
    
    

    /*@Override
    public String toString() {
        return "MiFecha{" + "dia=" + dia + ", mes=" + mes + ", año=" + anio + '}';
    }*/
    
}
