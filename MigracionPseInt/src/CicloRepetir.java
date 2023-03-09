
import java.util.Scanner;

public class CicloRepetir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt=0;
        do {
            menu();
            do {
                System.out.println("Digite su opcion:");
                opt=input.nextInt();
                if (opt<0 || opt>3) {
                    System.out.println("Opcion no permitida. Vuelva a intentar!!");
                }
            } while(opt<0 || opt>3);
            switch (opt) {
                case 1:
                    System.out.println("Hola!!!");
                    break;
                case 2:
                    System.out.println("Nuevamente Hola!!!");
                    break;
                case 3:
                    System.out.println("Chao!!!");
                    break; 
            }
        } while(opt!=0);
    }
    
    private static void menu() {
        System.out.println("******************MENU*********************");
        System.out.println("*                                         *");
        System.out.println("* 1. Saludar                              *");
        System.out.println("* 2. Repetir Saludo                       *");
        System.out.println("* 3. Despedida                            *");
        System.out.println("* 0. Salir                                *");
        System.out.println("*                                         *");
        System.out.println("*******************************************");
    }
    
}
