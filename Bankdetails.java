import java.util.Scanner;

class BankAccount {
    private String name;
    private long accountNo;
    private String email;
    private String phoneNo;


    
    public BankAccount() { //default
        this.name = "abc";
        this.accountNo = 19;
        this.email = "abc@gmail.com";
        this.phoneNo = "858";
    }

    
    public BankAccount(String name, long accountNo, String email, String phoneNo) { //paramterized
        this.name = name;
        this.accountNo = accountNo;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    
    public BankAccount(BankAccount acc3) { //copy
        this.name = acc3.name;
        this.accountNo = acc3.accountNo;
        this.email = acc3.email;
        this.phoneNo = acc3.phoneNo;
    }

    public void input() { //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();
        System.out.print("Enter your account number: ");
        this.accountNo = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Enter your email ID: ");
        this.email = sc.nextLine();
        System.out.print("Enter your phone number: ");
        this.phoneNo = sc.nextLine();
    }
  
    public void display() {
        System.out.println("Name " + name);
        System.out.println("Account Number " + accountNo);
        System.out.println("Email ID " + email);
        System.out.println("Phone Number " + phoneNo);
    }
}
public class Bankdetails{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(); //default
        acc1.display();

        BankAccount acc2 = new BankAccount("ayush", 123,"ayush@gmail.com","123456"); // param
        acc2.display();

        BankAccount acc3 = new BankAccount(acc2);
        acc3.display();

        BankAccount acc4 = new BankAccount();
        acc4.input();
        acc4.display();
        

    }
}

        

        
