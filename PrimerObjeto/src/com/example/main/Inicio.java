package com.example.main;


import com.example.data.Estudiante;
import java.util.Scanner;

public class Inicio extends Object {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Estudiante est = new Estudiante();
        System.out.println("Digite el documento");
        est.setDocumento(leer.nextLong());
        System.out.println("Digite el nombre");
        leer.nextLine();
        est.setNombre(leer.nextLine());
        System.out.println("Digite el promedio");
        est.setPromedio(leer.nextDouble());
        System.out.println(""+est);
    }
    
}
