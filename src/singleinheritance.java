class parent{
    void showparent()
    {
        System.out.println("This is parent class");
    }
}
class child extends parent{
    void showchild()
    {
        System.out.println("This is child class");
    }
}
class singleinheritance{
    public static void main(String args[]){
        child obj=new child();
        obj.showparent();
        obj.showchild();
    }

}