public class garbage_collect {
    public static void main(String[] args) 
    {
        garbage_collect obj1 = new garbage_collect();
        garbage_collect obj2 = new garbage_collect();

        obj1 = null;
        obj2 = null;

        System.gc();  
        System.out.println("Garbage Collection Requested");
    }
    @Override
    protected void finalize() 
    {
        System.out.println("Object is garbage collected");
    }
}
