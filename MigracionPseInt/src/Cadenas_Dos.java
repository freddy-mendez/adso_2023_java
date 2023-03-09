
import java.util.Scanner;

public class Cadenas_Dos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite el nombre del fisico 1");
        String nombre = input.next();
        input.nextLine();
        //System.out.println("Digite el nombre del fisico 2");
        //String nombre1 = input.nextLine().trim();
        switch (nombre) {
            case "Huver":
                System.out.println("No se haga con Ching");
                break;
            case "Anderson":
                System.out.println("No se haga con Huver");
                break;
            default:
                System.out.println("Estudie!!");
                break;
        }
        
    }
    
}
