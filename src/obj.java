class ClassA 
{
    void showA() 
    {
        System.out.println("This is Class A");
    }
}
class ClassB {
    void showB() 
    {
        System.out.println("This is Class B");
    }
}
public class obj {
    public static void main(String[] args) 
    {
        ClassA objA=new ClassA();
        ClassB objB=new ClassB();
        obj objC=new obj();
        objA.showA();
        objB.showB();
        objC.showC();
    }

    void showC() 
    {
        System.out.println("This is Class C (Main class)");
    }
}
