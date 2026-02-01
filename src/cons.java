class demo{
    demo(){
        this("Defualt Constructor");
    }
    demo(String message){
        System.out.println(message);
    }}
    public class cons{
        public static void main(String args[]){
            new demo();
        }
    }