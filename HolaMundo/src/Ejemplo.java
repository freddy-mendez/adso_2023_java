
import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Leer numeros
        System.out.println("Digite la edad de Huver");
        byte edad = input.nextByte();
        System.out.println("Digite la cantidad de productos a comprar");
        short cantidad = input.nextShort();
        System.out.println("Digite el documento del comprador");
        int cedula = input.nextInt();
        System.out.println("Digite el numero celular de Huver");
        long celular = input.nextLong();
        
        System.out.println("**********Procesando***********"); //Escribir
        
        System.out.println("Edad="+edad);
        System.out.println("Cantidad="+cantidad);
        System.out.println("Documento="+cedula);
        System.out.println("Celular="+celular);
        
        
    }
    
}
