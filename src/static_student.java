class static_student
{
    int rollNo;
    String name;
    static String collegeName = "SIT";
    static_student(int r, String n) 
    {
        rollNo=r;
        name=n;
    }
    void display() 
    {
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + collegeName);
    }
    public static void main(String[] args) 
    {
        static_student s1 = new static_student(103, "Mansi");
        s1.display();
    }
}
