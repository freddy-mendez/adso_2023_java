package com.example.main;

import com.example.data.Carro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        ArrayList<Carro> parqueadero = new ArrayList<>();
        boolean isOpen=true;
        String placa;
        Carro carro;
        do {
            System.out.println("1. Ingresar Carro");
            System.out.println("2. Salir Carro");
            System.out.println("3. Listar Carros");
            System.out.println("0. Cerrar Parqueadero");
            System.out.println("Digite su opción:");
            int opt = leer.nextInt();
            switch (opt) {
                case 1:
                    placa = leer.next();
                    carro = new Carro(placa);
                    //carro = new Carro();
                    parqueadero.add(carro);
                    break;
                case 2:
                    placa = leer.next();
                    for (int i=0; i<parqueadero.size(); i++) {
                        if (parqueadero.get(i).placa.equals(placa) &&
                              parqueadero.get(i).estado==true) {
                            carro=parqueadero.get(i);
                            carro.salida();
                            System.out.println("Valor a pagar"
                                    +carro.valorPagar(5000));
                            carro.estado=false;
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i=0; i<parqueadero.size(); i++) {
                        System.out.println(""+parqueadero.get(i));
                    }
                    break;
                case 0:
                    System.out.println(parqueadero);
                    isOpen=false;
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese nuevamente");
            }
        } while(isOpen);
    }
    
}
