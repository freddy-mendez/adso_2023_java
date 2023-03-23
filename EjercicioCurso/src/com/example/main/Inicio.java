package com.example.main;

import com.example.data.Curso;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Curso> cursos = new ArrayList();
        boolean activo = true;
        int opt=0;
        int codigo=0;
        String nombre="";
        String docente="";
        int creditos=0;
        do {
            System.out.println("1. Crear Curso con solo codigo y nombre");
            System.out.println("2. Crear Curso con codigo, nombre y docente");
            System.out.println("3. Crear Curso con codigo, nombre y creditos");
            System.out.println("4. Listar Cursos");
            System.out.println("0. Salir");
            System.out.println("Seleccione su opcion:");
            opt=leer.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Digite el codigo del curso");
                    codigo=leer.nextInt();
                    System.out.println("Digite el nombre del curso");
                    leer.nextLine();
                    nombre=leer.nextLine();
                    cursos.add(new Curso(codigo, nombre));
                    break;
                case 2:
                    System.out.println("Digite el codigo del curso");
                    codigo=leer.nextInt();
                    System.out.println("Digite el nombre del curso");
                    leer.nextLine();
                    nombre=leer.nextLine();
                    System.out.println("Digite el nombre del docente del curso");
                    docente=leer.nextLine();
                    cursos.add(new Curso(codigo, nombre, docente));
                    break;
                case 3:
                    System.out.println("Digite el codigo del curso");
                    codigo=leer.nextInt();
                    System.out.println("Digite el nombre del curso");
                    leer.nextLine();
                    nombre=leer.nextLine();
                    System.out.println("Digite el numero de creditos del curso");
                    creditos=leer.nextInt();
                    cursos.add(new Curso(codigo, nombre, creditos));
                    break;
                case 4:
                    /*for(Curso curso:cursos) {
                        System.out.println(""+curso);
                    }*/
                    for (int i=0; i<cursos.size(); i++) {
                        Curso curso = cursos.get(i);
                        System.out.println(""+curso);
                    }
                    break;
                case 0:
                    System.out.println("Salir de la aplicación");
                    break;
                default:
                    System.out.println("Opción no valida. Intente nuevamente");
            }
        }while(activo);
    }
    
}
