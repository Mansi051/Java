class parent{
    parent(){
        System.out.println("Parent class constructor");
    }
}
class child extends parent{
    child(){
        System.out.println("CHild class constructor");
    }
}
public class par{
    public static void main(String args[]){
        child c=new child();
        
    }
}