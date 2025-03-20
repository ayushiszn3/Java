import java.util.Scanner;

public class LargestArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int L1 = 0, L2 = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter any number: ");
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (num[i] > L1) {
                L1 = num[i];
            }
        }
        
        System.out.println("First largest = " + L1);
        
        for (int i = 0; i < 5; i++) {
            if (num[i] > L2 && num[i] < L1) {
                L2 = num[i];
            }
        }
        
        System.out.println("Second largest = " + L2);
        
        scanner.close();



    }
    
}












