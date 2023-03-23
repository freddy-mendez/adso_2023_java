
import java.util.Scanner;

public class mainclass {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String frase;
        String palabra;
        int inicio = 0;
        int fin = 0;
        int contador = 0;
        int pos = 0;
        String[] palabras;

        System.out.println("Escriba la frase");
        frase = scn.nextLine();

        palabras = new String[frase.length() / 2 + 1];
        while (contador < frase.length()) {
            String letra = frase.substring(contador, contador + 1);
            if (letra.equals(" ")) {
                fin = contador;
                palabra = frase.substring(inicio, fin);
                palabras[pos++] = palabra;
                inicio = contador + 1;
            }
            contador++;
            if (contador == frase.length()) {
                fin = contador;
                palabra = frase.substring(inicio, fin);
                palabras[pos++] = palabra;
            }
        }
        System.out.println("la cantidad de palabas es: " + pos);
        for (int i = 0; i < pos; i++) {
            System.out.println(palabras[i]);

        }
        System.out.println("la primera palabra es: " + palabras[0]);
        System.out.println("la ultima palabra es: " + palabras[pos - 1]);
        for (int i = 0; i < pos; i++) {
            StringBuilder invertida = new StringBuilder(palabras[i]);
            System.out.println(invertida.reverse().toString());
        }
        for (int i = pos-1; i >= 0; i--) {
            System.out.println(palabras[i]);
            

        }
    }

}
