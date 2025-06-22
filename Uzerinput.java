import java.util.Scanner;

public class Uzerinput {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;

        try {
            System.out.print("Enter the first number: ");
            num1 = sc.nextDouble();  // Accepts decimal numbers

            System.out.print("Enter the second number: ");
            num2 = sc.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (Exception e) {
            System.out.println("❗ Please enter a valid number ");
        }

        sc.close(); // Always good to close the Scanner
    }
}
