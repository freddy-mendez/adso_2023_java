
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner( System.in);
        int n=5;
        //Para i=0 hasta n con paso 1 hacer
        float suma=0;
        for (int i=0; i<n; i++) { //i++ => i=i+1
            System.out.println("Digite el valor del IMECA dia "+(i+1));
            int valor = leer.nextInt();
            suma += valor;
            //suma = suma + valor
        }
        float promedio = suma/n;
        System.out.println("Promedio = "+promedio);
        //Si promedio>170 Entonces
        if (promedio>170) {
            System.out.println("Tiene sanción");
        } else {
            System.out.println("No tiene sanción");
        }
    }
    
}
