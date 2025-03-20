abstract class Animal {
    abstract void walk();
    Animal() {
        System.out.println("youre creating a new animal");
    }

    
}
class Horse extends Animal{
    public void walk(){
    System.out.println("walks on 4 legs");
}
Horse(){
    System.out.println("created a horse");
}
}
class Chicken extends Animal{
    public void walk(){
    System.out.println("walks on 2 legs");
}
}



public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse(); 
   }
    
}
