
import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite n");
        int n=leer.nextInt();
        
        
        int [] numeros = new int[n];
        
        int [] pares = new int[n];
        int j=0;
        int [] impares = new int[n];
        int k=0;
        
        for (int i=0; i<n; i++) {
            System.out.println("Digite el numero");
            numeros[i]=leer.nextInt();
        }
        
        System.out.println(Arrays.toString(numeros));
        
        for (int i=0; i<n; i++) {
            if (numeros[i]%2==0) {
                pares[j++]=numeros[i];
            } else {
                impares[k++]=numeros[i];
            }
        }
        System.out.print("[");
        for (int i=0; i<j; i++) {
            System.out.print(((i==0)?"":",")+pares[i]);
        }
        System.out.println("]");
        
        
        
    }
    
}
