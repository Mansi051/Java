class animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class inh{
    public static void main(String args[]){
        dog d=new dog();
        d.eat();
        d.bark();
    }
}