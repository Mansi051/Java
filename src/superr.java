class Parent 
{
    int a=10;
    Parent() 
    {
        System.out.println("Parent class constructor executed");
    }
    void display() 
    {
        System.out.println("Parent class method executed");
    }
}
class Child extends Parent 
{
    int a=20;
    Child() 
    {
        super();   
        System.out.println("Child class constructor executed");
    }
    void show() 
    {
        System.out.println("Child variable a: " + a);
        System.out.println("Parent variable a: " + super.a);
        super.display();   
    }
}
public class superr 
{
    public static void main(String[] args) 
    {
        Child obj=new Child();
        obj.show();
    }
}
