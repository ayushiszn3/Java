class One {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

class Two extends One {
    public void print_for() {
        System.out.println("for");
    }
}

class Three extends Two {
    public void print_lastgeek() {
        System.out.println("Geeks");
    }
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        Three obj = new Three(); // Creating object of class Three
        
        // Calling methods from all three classes
        obj.print_geek();       // From class One
        obj.print_for();        // From class Two
        obj.print_lastgeek();   // From class Three
    }
}
