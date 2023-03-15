package ejemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionesDatos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> datos = new ArrayList();
        datos.add("5");
        datos.add("Hola");
        datos.add("3.1416");
        
        String numero =  datos.get(0);
        String cadena= datos.get(1);
        String valor =  datos.get(2);
        
        System.out.println("Tamaño:"+datos.size());
        datos.remove(0);
        System.out.println("Tamaño:"+datos.size());
        
        System.out.println("Digite le numero de personas");
        int n = leer.nextInt();
        
        for (int i=0; i<n; i++) {
            
        }
    }
    
}
