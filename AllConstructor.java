import java.util.Scanner;
class BankAccount{
    String name;
    int account;
    String email;
    String phone;

    BankAccount(){
        this.name = "Ayushi";
        this.account = 9981256;
        this.email = "ayushi@gmail.com";
        this.phone = "6261927645";
    }
    BankAccount(String name, int account, String email, String phone){
        this.name = name;
        this.account = account;
        this.email = email;
        this.phone = phone;
    }
    BankAccount(BankAccount acc3){
        this.name = acc3.name;
        this.account = acc3.account;
        this.email = acc3.email;
        this.phone = acc3.phone;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        this.name = sc.nextLine();
        System.out.println("enter your account no.");
        this.account = sc.nextInt();
        sc.nextLine();
        System.out.println("enter your email");
        this.email = sc.nextLine();
        System.out.println("enter your phone");
        this.phone = sc.nextLine();
    }
    public void display(){
        System.out.println("your name :"+ name);
        System.out.println("your account no." + account);
        System.out.println("your email" + email);
        System.out.println("your phone no."+ phone);
    }
}
public class AllConstructor {
    public static void main(String[]args){
        BankAccount acc1 = new BankAccount();
        acc1.display();

        BankAccount acc2 = new BankAccount("nirvan", 6328, "nirvan@gmail.com","8588868331");
        acc2.display();

        BankAccount acc3 = new BankAccount(acc2);
        acc3.display();

        BankAccount acc4 = new BankAccount();
        acc4.input();
        acc4.display();

    }
    
}
