
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float ingresoBase = 1800000;
        
        System.out.println("Digite el costo de la casa");
        float costoCasa = leer.nextFloat();
        System.out.println("Digite los ingresos de la persona");
        float ingresos = leer.nextFloat();
        
        float enganche = 0;
        float pagoMes = 0;
        
        if (ingresos>ingresoBase) {
            enganche = costoCasa*0.3F;
            pagoMes = ((costoCasa*0.7F)/7)/12;
        } else {
            enganche = costoCasa*0.15F;
            pagoMes = ((costoCasa*0.85F)/10)/12;
        }
        
        System.out.println("El pago de enganche es ="+enganche);
        System.out.println("El saldo es ="+(costoCasa-enganche));
        System.out.println("El pago mensual sera de ="+pagoMes);
    }
    
}
