package com.example.data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Ficha> fichas = new ArrayList();

        int opt=0;
        int contador=0;
        Ficha ficha=null;
        Aprendiz aprendiz=null;
        int numero;
        long documento;
        String programa, nombre;
        principal: do {
            System.out.println("1. Listar Fichas");
            System.out.println("2. Listar Aprendices de una Ficha");
            System.out.println("3. Crear Ficha");
            System.out.println("4. Matricular Aprendiz");
            System.out.println("0. Salir");
            System.out.println("Digite la opción:");
            opt=leer.nextInt();
            switch (opt) {
                case 1:
                    for (Ficha f:fichas) {
                        System.out.println(""+f);
                    }                    
                    break;
                case 2:
                    contador=0;
                    for (Ficha f:fichas) {
                        System.out.println("Pos="+contador+" - "+f);
                        contador++;
                    }
                    System.out.println("Digite la posicion de la ficha");
                    opt = leer.nextInt();
                    if (opt>=0 && opt<fichas.size()) {
                        ficha = fichas.get(opt);
                        for (Aprendiz apre: ficha.getAprendices()) {
                            System.out.println(""+apre);
                        }
                    } else {
                        System.out.println("La posicion de la ficha no es valida");
                    }
                    break;
                case 3:
                    System.out.println("Digite el numero de la ficha");
                    numero=leer.nextInt();
                    System.out.println("Digite el programa de la ficha");
                    leer.nextLine();
                    programa=leer.nextLine();
                    ficha = new Ficha(numero, programa);
                    fichas.add(ficha);
                    ficha=null;
                    break;
                case 4:
                    contador=0;
                    for (Ficha f:fichas) {
                        System.out.println("Pos="+contador+" - "+f);
                        contador++;
                    }
                    System.out.println("Digite la posicion de la ficha");
                    opt = leer.nextInt();
                    if (opt>=0 && opt<fichas.size()) {
                        ficha = fichas.get(opt);
                        System.out.println("Digite el documento del aprendiz");
                        documento=leer.nextLong();
                        System.out.println("Digite el nombre del aprendiz");
                        leer.nextLine();
                        nombre=leer.nextLine();
                        aprendiz=new Aprendiz(documento, nombre);
                        ficha.getAprendices().add(aprendiz);
                    } else {
                        System.out.println("La posicion de la ficha no es valida");
                    }
                    break;
                case 5:
                    int posMayor=0;
                    contador=0;
                    for (Ficha f:fichas) {
                        if (f.getAprendices().size()>fichas.get(posMayor).getAprendices().size()) {
                            posMayor=contador;
                        }
                        contador++;
                    }
                    if (fichas.size()>0) {
                        System.out.println("La ficha que tiene el mayor numero de aprendices es :"+
                            fichas.get(posMayor));
                    } else {
                        System.out.println("No se tienen fichas creadas");
                    }
                    
                    
                    break;
                case 0:
                    break principal;
                default:
                    throw new AssertionError();
            }
        } while(true);
    }
    
}
