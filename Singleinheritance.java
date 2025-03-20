
class One {
    public void print_geek(){
        System.out.println("Geeks");
    }
}
class Two extends One {
    public void print_for(){
        System.out.println("for");
    }
}
public class Singleinheritance {
    public static void main(String[] args) {
        Two g_obj = new Two();
        g_obj.print_geek();
        g_obj.print_for();
        g_obj.print_geek();
    }
    
}
