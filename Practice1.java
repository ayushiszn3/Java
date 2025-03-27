import java.util.Scanner;
class BankAccount{
    String name;
    int accountno;
    String email;
    String phoneno;

    public BankAccount(){ //default
        this.name = "ayush";
        this.accountno = 123;
        this.email = "ayush@gmail.com";
        this.phoneno = "8319877812";
    }
    public BankAccount(String name, int accountno, String email, String phoneno){ //parameterized
        this.name = name;
        this.accountno = accountno;
        this.email = email;
        this.phoneno = phoneno;

    }
    public BankAccount(BankAccount acc3){ //copy
        this.name = acc3.name;
        this.accountno = acc3.accountno;
        this.email = acc3.email;
        this.phoneno = acc3.phoneno;

    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        this.name = sc.nextLine();
        System.out.println("enter your account no");
        this.accountno = sc.nextInt();
        System.out.println("enter your email");
        this.email = sc.nextLine();
        sc.nextLine();
        System.out.println("enter your phone no");
        this.phoneno = sc.nextLine();
    }
    public void display(){
        System.out.println("your name is :"+ name);
        System.out.println("your account no. is :"+accountno);
        System.out.println("your email is :"+ email);
        System.out.println("your phone no is :"+ phoneno);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.display();

        BankAccount acc2 = new BankAccount("abc", 19201,"abc@gmail.com","85");
        acc2.display();

        BankAccount acc3 = new BankAccount(acc2);
        acc3.display();

        BankAccount acc4 = new BankAccount();
        acc4.input();
        acc4.display();

    }
    
}

