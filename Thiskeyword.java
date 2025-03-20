public class Thiskeyword {

    public void display(){
        System.out.println(this.num);
    }

    int num;
    Thiskeyword(int num){
        this.num = num;
    }
    public static void main(String[] args) {
        Thiskeyword obj = new Thiskeyword(2);
        obj.display();

    }
    
}
