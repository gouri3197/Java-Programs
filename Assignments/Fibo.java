 class Fibo
 {
    public static void main(String args[]) {
        int a = 0;

        int b = 1;

            System.out.print(a + " " + b);
        
        for (int i = 3; i <= 10; i++)
 {
        int result = a + b;

            System.out.print(" " + result);

            a = b;
            b = result;
        }
    }
}
