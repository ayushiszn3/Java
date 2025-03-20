import java.lang.Math;
import java.util.Scanner;
public class Function {
    public static void CalcPwr(double X, double N){
        double power = Math.pow(X , N);
        System.out.println("x^n = " +power);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of x : ");
        double x = sc.nextDouble();

        System.out.print("enter the value of n : ");
        double n = sc.nextDouble();

        CalcPwr(x, n);



    }
    
}
