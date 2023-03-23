package javaapplication17;

import java.util.Arrays;
import java.util.Scanner;

public class NewMain {

    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int m,n,pos,menor,a[],b[],c[];
        System.out.println("digite valor de n");
        n = scn.nextInt();
        System.out.println("digite valor m");
        m = scn.nextInt();
        
        a = new int[n];
        b = new int[m];
        
        if (n<m) {
            menor=n;
        }else{ menor=m;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("digite el numero");
            a[i]=scn.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            System.out.println("digite el numero");
            b[i]=scn.nextInt();
        }
        
        c =new int [n+m];
        pos=0;
        
        for (int i = 0; i < menor; i++) {
            c [pos++]= a[i];
            c[pos++]=b[i];
        }
        
     
        
        if (n==menor) {
            for (int i=menor; i<m; i++) {
                c[pos++]=b[i];
            }
        } else {
            for (int i=menor; i<n; i++) {
                c[pos++]=a[i];
            }
        }
        
        System.out.println(Arrays.toString(c));
        
        
        
    }
    
}
