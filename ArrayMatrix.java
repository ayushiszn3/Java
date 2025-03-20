import java.util.Scanner;

public class ArrayMatrix {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        // Input for matrix A
        System.out.println("Enter values for matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Input for matrix B
        System.out.println("Enter values for matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        // Matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display the sum matrix
        System.out.println("Resultant Matrix (A + B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}  

