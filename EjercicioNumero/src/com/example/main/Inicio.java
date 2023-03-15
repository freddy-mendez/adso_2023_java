package com.example.main;

import com.example.data.Numero;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char opt='O';
        Numero numero;
        do {
            System.out.println("Desea ingresar un numero? [S -> si, N -> no]");
            opt=leer.next().toUpperCase().charAt(0);
            if (opt=='S') {
                System.out.println("Digite el numero");
                numero = new Numero(leer.nextInt());
                System.out.println("Es Par o Impar:?"+numero.parOimpar());
                System.out.println("Es positivo, negativo o cero:"+numero.positivoNegativoOCero());
                System.out.println("Es primo?"+numero.esPrimo());
            }
        }while(opt!='N');
    }
    
}
