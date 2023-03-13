
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Estudiante est = new Estudiante();
        System.out.println("Digite el documento");
        est.documento=leer.nextLong();
        System.out.println("Digite el nombre");
        leer.nextLine();
        est.nombre=leer.nextLine();
        System.out.println("Digite el promedio");
        est.promedio=leer.nextDouble();
        System.out.println(est);
    }
    
}
