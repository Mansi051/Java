//import java.lang.StringBuilder;

public class first {
    public static void main(String[] args) {

        String n = "Mansi";
        StringBuilder rev = new StringBuilder();

        for (int i = n.length() - 1; i >= 0; i--) {
            rev.append(n.charAt(i));
        }

        System.out.println("Reversed Name: " + rev.toString());
    }
}
