import java.util.Scanner;

public class EjemploCadena {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Digite el nombre");
        String nombre = input.next();
        input.nextLine();
        System.out.println("Digite el apellido");
        String apellido = input.nextLine();
        System.out.println("Digite la Edad");
        byte edad = input.nextByte();
        //String apellido = "";*/
        
        String arreglo = input.nextLine();
        
        String [] numeros = arreglo.split("[ ]+");
        
        System.out.print("[");
        for (int i=0; i<numeros.length; i++) {
            System.out.print(((i==0)?"":",")+numeros[i]);
        }
        System.out.println("]");
        System.out.println("La frase tiene "+numeros.length+" palabras");
        
        
        //System.out.println(nombre+" "+apellido);
    }
    
}
