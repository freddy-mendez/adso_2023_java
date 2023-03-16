
package com.example.main;

import com.example.data.Servicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        ArrayList <Servicios> Clientes = new ArrayList();
        
        int opt = 1;
        String nombre ="";
        int codigo;
        int estrato;
        int consumo;
        double factura_servicio = 0;
        int totalServicioAgua=0;
        do{
            System.out.println("1. Ingresar datos");
            System.out.println("2. Ver valores individuales y Total ");
            System.out.println("0. Finalizar Proceso ");
            opt=leer.nextInt();
            
            
            switch (opt) {
                case 1:
                    
                    System.out.println("Ingrese el Codigo");
                    codigo=leer.nextInt();
                    leer.nextLine();
                    System.out.println("Ingrese el Nombre del cliente");
                    nombre=leer.nextLine();
                    System.out.println("Ingrese el Estrato");
                    estrato=leer.nextInt();
                    System.out.println("Ingrese el consumo");
                    consumo=leer.nextInt();
                    if (estrato>=1 && estrato<=5 && consumo >=0){
                     Clientes.add(new Servicios(codigo,nombre,estrato,consumo));   
                    }else{
                        System.out.println("El estrato debe estar en el rango entre 1 y 5 y el consumo mayor o igual a 0");
                    }
                    
                    /*System.out.println(Clientes);*/
                    
                    break;
                        
                case 2:
                    for(Servicios servicio: Clientes){
                        
                    Double valorServicio=servicio.setfactura_servicio();
                    totalServicioAgua+=valorServicio;
                    System.out.println("El Suscriptor "+servicio.getNombre()+" tiene un Valor a Pagar de: $"+valorServicio);   
                    }
                    System.out.println("El Total a pagar de todos los suscriptores es: $"+totalServicioAgua);
                    totalServicioAgua=0;
                   break; 
              
                     
                     
                     
                case 0:
                    System.out.println("Proceso finalizado");
                    break;
                        
                    
                
            }
            
        }while(opt==1||opt==2);
       
        
        
    }
    
}
