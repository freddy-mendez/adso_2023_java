
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Teleinformatica III
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el float");
        double a = leer.nextFloat()*1.0;
        System.out.printf("%.1f %d %c %n",a, 15, 'A' );
        //System.out.println(""+a);
        
        if (a>10000 && a<100000000) {
            
        }
    }
    
}
