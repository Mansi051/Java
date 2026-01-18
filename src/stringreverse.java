public class stringreverse {

    //Using predefined function
    void reverse(String str) 
    {
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Reversed (Predefined): " + sb.reverse());
    }

    //Without using predefined function
    void reverse(String str,int n) 
    {
        String rev= "";
        for (int i=str.length()-1; i>=0;i--) 
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed (Manual): " + rev);
    }

    public static void main(String args[]) 
    {
        stringreverse obj=new stringreverse();
        obj.reverse("Java");
        obj.reverse("Java", 1);
    }
}
 
    

