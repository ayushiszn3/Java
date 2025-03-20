import java.util.Scanner;

public class Ifstatement {
    public static void main(String[]args){
    //     boolean IsSunUp = true;
    //     if (IsSunUp == true)
    //     System.out.println("day");
    //     else
    //     System.out.println("night");
    // 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    int age = sc.nextInt();
    if(age >= 18)
    System.out.println("can vote");
    else
    System.out.println("cant vote");
    }
}
