import java.util.Scanner;
public class Ayush{
    public static void main(String[] args){
         
         Scanner sc = new Scanner(System.in);
          
        System.out.println("Enter num:");
        int a = sc.nextInt();
        
        
     
        for(int i =2 ; i<=a ;i++)
        {
            boolean isPrime = true;
            
            for(int j=2; j<i; j++){
                 if (i%j==0){
                     isPrime = false;
                     break;
                 }
            }
            
            if(isPrime){
                System.out.println(i);
            }
            }
        sc.close();    
    }

}
       

