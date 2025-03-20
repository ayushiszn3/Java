class Parent {
    final void display()
    {
        System.out.println("This is a final method");
    }
    
}
class Child extends Parent {
    // Cannot override display() because it is final
}


    public class FinalExample {

    public static void main(String[] args) {
        final int x = 10;
        // x = 20;  // Compilation error because x is final
    }
}
