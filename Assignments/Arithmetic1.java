import java.util.Scanner;
       class Arithmetic1{

          public static void main(String args[])
           {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");

        int a = input.nextInt();
        System.out.println("Enter the second number:");

        int b = input.nextInt();
        int result = a + b;
        int result1 = a - b;
        int result2 = a * b; 
        int result3 = a / b;
        int result4 = a % b;

        System.out.println(a + "+" + b + "=" + result);
        System.out.println(a+ "-" + b +"=" +result1);
        System.out.println(a+ "*" + b + "=" +result2);
        System.out.println(a+ "/" + b + "=" +result3);
        System.out.println(a+ "mod" + b + "=" +result4);



    }
}
 