class Animal{
    String name;
    String food;
    public void eats(){
        System.out.println(name + " eats " + food);
    }
}
class Dog extends Animal{
    public void speaks(){
        System.out.println("dog barks");
    }
}
public class Inheritexample {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "rocky";
        d1.food = "bread";
        d1.eats();
        d1.speaks();
    
    
}
}
