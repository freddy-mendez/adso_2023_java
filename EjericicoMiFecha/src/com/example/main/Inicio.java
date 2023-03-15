package com.example.main;

import com.example.data.MiFecha;
import com.example.data.Producto;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //MiFecha fecha = new MiFecha(21,12,2004);
        MiFecha fecha = new MiFecha(14,3,2023);
        /*MiFecha fecha = new MiFecha();
        fecha.dia=21;
        fecha.mes=12;
        fecha.anio=2004;*/
        System.out.println(""+fecha);
        //Producto p = new Producto(fecha);
        Producto p = new Producto();
        System.out.println(""+p);
        if (fecha.equals("Iguales")) {
            System.out.println("Las Fechas son iguales");
        } else {
            System.out.println("Las Fechas no son iguales");
        }
    }
    
}
