
import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double tarea1, tarea2,tarea3;
        double examen;
        double promTareas, promMateria;
        
        System.out.println("Digite la tarea 1 de Mate.");
        tarea1=leer.nextDouble();
        System.out.println("Digite la tarea 2 de Mate.");
        tarea2=leer.nextDouble();
        /*System.out.println("Digite la tarea 3 de Mate.");
        tarea3=leer.nextDouble();*/
        System.out.println("Digite la tarea 1 de Mate.");
        examen=leer.nextDouble();
        //promTareas=(tarea1+tarea2+tarea3)/3;
        promTareas=(tarea1+tarea2)/2;
        promMateria=(examen*0.9)+(promTareas*0.1);
        System.out.println("La materia mate = "+promMateria);
        
        System.out.println("Digite la tarea 1 de Fis.");
        tarea1=leer.nextDouble();
        System.out.println("Digite la tarea 2 de Fis.");
        tarea2=leer.nextDouble();
        System.out.println("Digite la tarea 3 de Fis.");
        tarea3=leer.nextDouble();
        System.out.println("Digite la tarea 1 de Fis.");
        examen=leer.nextDouble();
        promTareas=(tarea1+tarea2+tarea3)/3;
        promMateria=(examen*0.8)+(promTareas*0.2);
        System.out.println("La materia Fis = "+promMateria);
        
        
        
    }
}
