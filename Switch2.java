import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a day from 1 to 7");
        int day = sc.nextInt();

        switch(day)
        {
            case 1 :
            System.out.println("its monday");
            break;

            case 2 :
            System.out.println("its tuesday");
            break;

            case 3 :
            System.out.println("its wednesday");
            break;

            case 4 :
            System.out.println("its thursday");
            break;

            case 5 :
            System.out.println("its friday");
            break;

            case 6 :
            System.out.println("its saturday");
            break;

            case 7 :
            System.out.println("its sunday");
            break;

            default :
            System.out.println("invalid day");
        }
    }
    
}
