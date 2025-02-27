public class Evenodd{


         public static void checkEvenOdd(int number) {

             if (number % 2 == 0) {

            System.out.println(number + "  It is a  even number.");
        }
      else {
            System.out.println(number + " It is a odd number.");
        }
    }

        public static void main(String[] args) {
        checkEvenOdd(25);  
        checkEvenOdd(36);  
    }
}