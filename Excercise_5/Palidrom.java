import java.util.Scanner;

public class Palidrom {
        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            System.out.println("Enter any number : ");
            int number = num.nextInt();
          int  reversedNum = 0, remainder;
          
          // store the number to originalNum
          
         
          int originalNum = number;
          // get the reverse of originalNum
          // store it in variable
          while (number != 0) {
            remainder = number % 10;
            reversedNum = reversedNum * 10 + remainder;
            number /= 10;
          }
          
          // check if reversedNum and originalNum are equal
          if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
          }
          else {
            System.out.println(originalNum + " is not Palindrome.");
          }
        }
      
}
