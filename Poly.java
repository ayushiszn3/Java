
class Student { //compile time polymorphism
    String name;
    int age;
    
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }

}

public class Poly {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.name = "Ayush";
        s1.age = 9;
        s1.printInfo(s1.name,s1.age);
        
        
    }
    
}








