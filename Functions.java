
import java.util.Scanner;
public class Functions{
    
    public static void printFunction(Object A) {
            System.out.println(A);
            return;
    }
    
    
    public static void sum(int B , int C){
        System.out.println(B+C);
        return;
        
    }
    
    public static void name(String k){
        System.out.println(k);
        return;
    }
    
    
    public static void main(String[] args){
        printFunction(1);
        printFunction("koli");
        sum(1,2);
        name("Harsh");
    }
}
