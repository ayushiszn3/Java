public class Test2 {
    int num;

    Test2(int num)
    {
        this.num = num;
    }
    void modify(Test2 t)
    {
        t.num += 10;
    }
    public static void main(String[]args)
    {
        Test2 obj = new Test2(5);
        obj.modify(obj);
        System.out.println("Value after method call:"+obj.num); //Modified value 15
    }
}
