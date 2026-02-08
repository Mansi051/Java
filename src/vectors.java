import java.util.Vector;

public class vectors 
{
    public static void main(String[] args) 
    {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Vector Elements:");
        for (int num : numbers) 
            {
            System.out.println(num);
        }
    }
}
