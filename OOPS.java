class Student{
    String name;
    int age;

    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class OOPS {
    public static void main(String[]args){
        Student s1 = new Student("ayush",9);
        s1.PrintInfo();

    }
    
}
