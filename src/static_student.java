class Student {
    int rollNo;
    String name;
    static String collegeName = "SIT";
    Student(int r, String n) 
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
        Student s1 = new Student(103, "Mansi");
        s1.display();
    }
}
