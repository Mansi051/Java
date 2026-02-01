class Parent {
    int x=20;
    Parent() 
    {
        System.out.println("Parent Constructor Executed");
    }
    void show() 
    {
        System.out.println("Parent class method");
    }
}

class Child extends Parent 
{
    int x=50;
    Child() 
    {
        super();  
        System.out.println("Child Constructor Executed");
    }

    void display() 
    {
        System.out.println("Child x (this.x): " + this.x);
        System.out.println("Parent x (super.x): " + super.x);

        this.showChild();
        super.show();
    }

    void showChild() 
    {
        System.out.println("Child class method");
    }
}

public class this_super 
{
    public static void main(String[] args) 
    {
        Child obj=new Child();
        obj.display();
    }
}
