import java.util.Scanner;
 class LargestNum {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

         System.out.println("Enter the first number:");

             int a = input.nextInt();

         System.out.println("Enter the second number:");
                
               int b = input.nextInt();
        System.out.println("Enter the third number:");
               int c = input.nextInt();
              
                if( a >= b && a >= c)
                   System.out.println(a + " is the largest number.");

                else if (b >= a && b >= c)
                    System.out.println(b + " is the largest number.");

                else
                   System.out.println(c + " is the largest number.");
        }
}