import java.util.Scanner;

public class Switch{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("press button number : ");
        int button = sc.nextInt();
        
        switch(button){
            case 1 : System.out.print("Hello");
            break;
            case 2 : System.out.print("Namaste");
            break;
            case 3 : System.out.print("Namaskar");
            break;
            default : System.out.print("Invalid buttton");
        }
        sc.close();



    }
}