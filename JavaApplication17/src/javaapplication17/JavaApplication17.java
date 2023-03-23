package javaapplication17;

import java.util.Scanner;

public class JavaApplication17 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuantos documentos de algebra quiere escribir");
        int n = leer.nextInt();
        
        long [] documentoAlgebra=new long [n];
        
        
        System.out.println("Escriba "+n+ " documentos de algebra");
        for (int i=0; i<n; i++){
            documentoAlgebra[i]=leer.nextLong();
        }
            
        System.out.println("Cuantos documentos de Algoritmo quiere escribir");
        int m = leer.nextInt();        
        long [] documentoAlgoritmo = new long [m];        
    
        System.out.println("Escriba "+ m+ " documentos de algoritmo");
        for (int i=0; i<m; i++){
            documentoAlgoritmo[i]=leer.nextLong();
        }
        int grupo_mayor = 0;
        
        if (n>m){
            grupo_mayor = n;
        }else{
            grupo_mayor = m;
        }
        
        int k=0;
        long [] documentos_iguales = new long [grupo_mayor];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (documentoAlgebra[i]==documentoAlgoritmo[j]){
                    documentos_iguales[k]=documentoAlgebra[i];
                    k+=1;
                }
            }
        }
        
        System.out.println("Los documentos iguales son: ");
        for (int i=0; i<grupo_mayor; i++){
            if (documentos_iguales[i]!=0){
                System.out.println(documentos_iguales[i]);
            }
            
        }
        
    }
    
}
