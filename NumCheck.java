import java.util.Scanner;

public class NumCheck{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num 1 :");
        int num1 = sc.nextInt();
        
        System.out.print("Enter num 2 :");
        int num2 = sc.nextInt();
        
        if(num1==num2){
            System.out.print("num1 = num2");
        }
        else if(num1>num2){
                System.out.print("num1 is greater");
            }
        else{
                System.out.print("Num2 is greater");
            }
        
        sc.close();
    }
}