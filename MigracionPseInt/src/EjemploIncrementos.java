public class EjemploIncrementos {

    public static void main(String[] args) {
        
        int i = 5;//9
        int j = i++ + ++i + ++i + i++;
        //      5   +  7  +  8  + 8 
        System.out.println("j="+j);
        
        
        int a = 5;
        a=++a;
        a=++a;
        a=++a;
        System.out.println("a="+a);
        
    }
    
}
