
import java.util.Scanner;

public class TableofN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int table = n;

        for (int i = 1; i <= 10; i++) {
            table = i * n;
            System.out.println(table);
        }

        sc.close();
    }
}
