public class calculator {

    public static int add(int a, int b) {
        return a+b;
    }

    public static int sub(int a, int b) {
        return a-b;
    }

    public static int mul(int a, int b) {
        return a*b;
    }

    public static int div(int a, int b) {
        if(b==0) 
        {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("Calculator:\n");

        int a=10;
        int b=5;

        int sum=add(a, b);
        int subt=sub(a, b);
        int mult=mul(a, b);
        int divs=div(a, b);

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + subt);
        System.out.println("Multiplication = " + mult);
        System.out.println("Division = " + divs);
    }
}
