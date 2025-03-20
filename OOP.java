
class Student {
    String name;
    int age;
    
    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    }
}

public class OOP {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.name = "Ayush";
        s1.age = 9;
        s1.printInfo();
        
        
    }
    
}
