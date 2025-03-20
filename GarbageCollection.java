public class GarbageCollection {
    int num;
    GarbageCollection(int num)
    {
        this.num = num;
    }
    protected void finalize()
    {
        System.out.println("Garbage Collected :"+num);
    }
    public static void main(String[]args)
    {
        GarbageCollection C1 = new GarbageCollection(1);
        GarbageCollection C2 = new GarbageCollection(2);

        C1 = C2; // the object oringally referenced by C1 is now eligible for Garbage Collection
        System.gc(); // requesting garbage collection
    }
    
}
