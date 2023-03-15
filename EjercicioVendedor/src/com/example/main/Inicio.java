package com.example.main;

import com.example.data.Vendedor;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n=25;
        Vendedor [] vendedores = new Vendedor[n];
        
        int opt;
        long documento;
        byte tipo;
        float ventas;
        Vendedor vendedor;
        int pos=0;
        ciclo1: do {
            System.out.println("1. Agregar Vendedor");
            System.out.println("2. Comision de Vendedor");
            System.out.println("0. Salir");
            System.out.println("Digite la opción:");
            opt=leer.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Digite el documento");
                    documento=leer.nextLong();
                    System.out.println("Digite el tipo de vendedor"+
                            "[1. PaP, 2. Telemercadeo]");
                    tipo=leer.nextByte();
                    System.out.println("Digite la venta mensual del vendedor");
                    ventas=leer.nextFloat();
                    vendedor = new Vendedor(documento, tipo, ventas);
                    vendedores[pos++]=vendedor;
                    break;
                case 2:
                    System.out.println("Digite el documento");
                    documento=leer.nextLong();
                    for (int i=0; i<pos; i++) {
                        Vendedor vendedor1 = vendedores[i];
                        if (vendedor1.getDocumento()==documento) {
                            System.out.println("La comision del vendedor es:");
                            System.out.println( vendedor1.getComision());
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Fin");
                    break ciclo1;
                default:
                    throw new AssertionError();
            }
        }while(true);
        
        
    }
    
}
