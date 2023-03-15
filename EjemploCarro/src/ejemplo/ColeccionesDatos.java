package ejemplo;

import java.util.ArrayList;

public class ColeccionesDatos {

    public static void main(String[] args) {
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
    }
    
}
