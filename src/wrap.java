public class wrap{
    public static void main(String args[]){
        int i=3;
        double d=2.4;
        System.out.println("Integer i: "+i);
        System.out.println("Double d: "+d);
        Integer i1=Integer.valueOf(i);
        Double d1=Double.valueOf(d);
        System.out.println("Wrapped Integer i1: "+i1);
        System.out.println("Wrapped Double d1: "+d1);
        String str1="123";
        String str2="123";
        System.out.println("String str1: "+(str1+str2));
        int s1=Integer.parseInt(str1);
        int s2=Integer.parseInt(str2);
        System.out.println("Parsed int s1: "+(s1+s2));
    }
}