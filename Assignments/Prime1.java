import java.util.Scanner;

class Prime1{
  
   public static void main(String[] args){

         Scanner in = new Scanner(System.in);
   
            System.out.print("Input a number: ");
  
               int a = in.nextInt();
           
               int result = a/a; 
               int result1=  a/1;

              System.out.println(" It is aprime number" +a);
      }
}