class Test {

    public static void main(String[] args) {

        Test obj1 = new Test();
        obj1 = null; 
        System.gc(); 
    }
}
