import java.util.Scanner;
public class GCD {
    public static int CalcGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number : ");
        int num1 = sc.nextInt();

        System.out.println("enter a number : ");
        int num2 = sc.nextInt();

        int gcd = CalcGCD(num1, num2);
        System.out.println("GCD IS : " + gcd);
        

    }
    
}
