
import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n=5;
        int [] edades; //Declaracion de variables
        edades = new int[n]; //Inicialización
        
        
        
        String [] nombres = new String[n];//Declaración e Inicialización
        //Dimension edades(25)
        System.out.printf(" %.2f%%",0.0589);
        //Para i=1 hasta 5 con paso 1 haga
        for (int i=0; i<n; i++) {
            System.out.println("Digite el nombre de la persona");
            nombres[i]=input.nextLine();
            System.out.println("Digite la edad de la persona");
            edades[i]=input.nextInt();
            input.nextLine();
        }
        
        
        
        System.out.println(Arrays.toString(edades));
        System.out.println(Arrays.toString(nombres));
        
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (edades[j]<edades[i]) {
                    int aux = edades[i];
                    edades[i]=edades[j];
                    edades[j]=aux;
                    String temp = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = temp;
                }
            }
        }
        
        
        System.out.println(Arrays.toString(edades));
        System.out.println(Arrays.toString(nombres));
        
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (nombres[j].compareToIgnoreCase(nombres[i])<0) {
                    int aux = edades[i];
                    edades[i]=edades[j];
                    edades[j]=aux;
                    String temp = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(edades));
        System.out.println(Arrays.toString(nombres));
    }
    
}
