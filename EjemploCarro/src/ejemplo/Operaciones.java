package ejemplo;

public class Operaciones {
    
    public int suma(int... n) {
        int suma = 0;
        for(int i=0; i<n.length; i++) {
            suma+=n[i];
        }
        return suma;
    }
    
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        System.out.println("suma 2 numeros="+op.suma(15, 10));
        System.out.println("suma 3 numeros="+op.suma(15, 10, 20));
        System.out.println("suma 4 numeros="+op.suma(15, 10, 40, 10, 15, 10, 40, 10));
    }
    
}
