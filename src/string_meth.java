public class string_meth {
    public static void main(String args[]){
        String str= " Java Programming ";
        System.out.println("Length: "+str.length());
        System.out.println("Trimmed: "+str.trim());
        System.out.println("Uppercase: "+str.toUpperCase());
        System.out.println("Substring(2,6): "+str.substring(2,6));
        System.out.println("Replaced Java with python: " +str.replace("Java","Python"));
    }
    
}
