public class ReturningObjects {
    int num;

    ReturningObjects(int num)
    {
        this.num = num;
    }
    ReturningObjects add(ReturningObjects input)
    {
        return new ReturningObjects(this.num + input.num);
    }
    public static void main(String[]args)
    {
        ReturningObjects obj1 = new ReturningObjects(10);
        ReturningObjects obj2 = new ReturningObjects(20);
        ReturningObjects obj3 = obj1.add(obj2);

        System.out.println("Sum:"+ obj3.num);
    }
}
