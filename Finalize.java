class Finalize {
    protected void finalize () 
    {
        System.out.println("Object is being garbage collected"); 
    }
    public static void main(String[] args) 
    {
        Finalize obj = new Finalize();
        obj = null;
        System.gc();
    }

}
