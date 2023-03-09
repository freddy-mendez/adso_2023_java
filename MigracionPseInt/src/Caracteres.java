
import java.util.Scanner;

public class Caracteres {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite una palabra");
        String palabra = leer.next();
        System.out.println("Digite S o N");
        char opt = leer.next().toUpperCase().charAt(0);
        
        if (opt=='s')
        
        System.out.printf("%s %c %n", palabra, opt);
        
        
    }
    
}
