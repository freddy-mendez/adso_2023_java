
import java.util.Scanner;

public class CicloMientras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero=0;
        int suma=0;
        while(true) {
            System.out.println("Digite un numero entero. Escriba -1 para Salir");
            numero = leer.nextInt();
            if (numero<0) {
                break;
            }
            suma=suma+numero;
        }
        System.out.println("La suma es="+suma);
    }
    
}
