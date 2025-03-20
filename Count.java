import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int Positivenum =0 ;
       int Negativenum =0;
       int Zero =0;
       String Choice;

       do{
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        if(n > 0){
            Positivenum++;
        } else if(n < 0){
            Negativenum++;
        } else {
            Zero++;
        }
        System.out.println("Do you want to continue?(yes/no) : ");
        Choice = sc.next();

       } while(Choice.equalsIgnoreCase("yes"));
       System.out.println("\nPositive numbers : "+Positivenum);
       System.out.println("Negative numbers : "+Negativenum);
       System.out.println("Zeroes : "+Zero);


    }
}
