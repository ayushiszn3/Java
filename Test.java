public class Test {  //pass by value primitve type
    void modify(int x){
        x = x+10;
    }
   
    public static void main(String[]args)
    {
        Test obj = new Test();
        int num = 5;
        obj.modify(num);
        System.out.println("Value after method call:"+num);
    }
}
