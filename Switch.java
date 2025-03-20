import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter an operator(+,-,*,/)");
        char operator = sc.next().charAt(0);
        System.out.println("enter num2");
        int num2 = sc.nextInt();

        switch(operator) {
            case '+' :
            System.out.println("sum is :" + num1 + num2);
            break;

            case '-':
            System.out.println("diff is :" + (num1 - num2));
            break;

            case '*':
            System.out.println("product is :" + num1 * num2);
            break;

            case '/':
            if(num2 == 0)
            System.out.println("denominator cannot be 0");
            else
            System.out.println("division is :" + num1/num2);
            break;

            default :
            System.out.println("invalid input");
        }




    }
}
