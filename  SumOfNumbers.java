
import java.util.Scanner;
public class  SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        // Input values
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            num[i] = scanner.nextInt();
        }

        // Calculate sum
        for (int i = 0; i < 5; i++) {
            sum += num[i];
        }

        // Print sum
        System.out.println("\nSum of numbers = " + sum);
        
        scanner.close();
    }

}
