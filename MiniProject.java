import java.util.Scanner;
public class MiniProject {
    public static void main(String[] args) {
        int Mynumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        do{
            System.out.println("guess a number (1-100)");
            userInput = sc.nextInt();

            if(userInput == Mynumber){
                System.out.println("YAY CORRECT NUMBER");
                break;
            }
            else if(userInput > Mynumber){
                System.out.println("think of a smaller number");
            }
            else{
                System.out.println("think of a larger number");
            }

        } while ( userInput >= 0);
        System.out.println("My number is :" + Mynumber);
    }
}
        
    

