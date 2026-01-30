class sum {
    static void add(int a, int b) 
    {
        int sum=a+b;
        System.out.println("Sum = " +sum);
    }
    public static void main(String[] args) 
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        add(x,y);
    }
}
