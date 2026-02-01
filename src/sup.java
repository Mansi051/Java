class parent{
    void display(){
        System.out.println("Parent class method");
    }
}
class child extends parent
{
    void display()
    {
        super.display();
        System.out.println("Child class method");
    }
}
public class sup{
    public static void main(String args[]){
        child c=new child();
        c.display();
    }
}