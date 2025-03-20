import java.util.Scanner;
class Shape{
    public void area(){
        System.out.println("displays area");
        
    }
}
class Triangle extends Shape{ 
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }

}
class Equilateraltriangle extends Triangle {
    public void area(int l, int h){
        System.out.println(1 /2*l*h);
    } 
}

public class Inherit {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length and breadth of your triangle");
        int l = sc.nextInt();
        int h = sc.nextInt();
        t1.area();
    }
    
}
