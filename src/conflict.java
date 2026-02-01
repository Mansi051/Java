class student
{
    String name;
    student(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name: " +this.name);
    }
}
public class conflict{
    public static void main(String args[]){
        student s=new student("Alice");
        s.display();
    }
}