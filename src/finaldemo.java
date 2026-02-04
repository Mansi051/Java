final class Bank 
{
    final double INTEREST_RATE = 7.5;
    final void displayRate() 
    {
        System.out.println("Interest Rate: " + INTEREST_RATE + "%");
    }
}

public class finaldemo 
{
    public static void main(String[] args) 
    {
        Bank b = new Bank();
        b.displayRate();
    }
}
