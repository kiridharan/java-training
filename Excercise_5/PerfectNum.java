import java.util.Scanner;

public class PerfectNum {
    public static void main(String args[]) 
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter any number : ");
      int inputNumber = scan.nextInt();
      boolean result = isPerfectNumber(inputNumber);
      if (result == true)
        System.out.println(inputNumber + " is a Perfect Number");
      else 
        System.out.println(inputNumber + " is Not a Perfect Number");          
    }
    
    public static boolean isPerfectNumber(int num) 
    {
     
      int sum = 0;
      for (int i=1;i < num;i++)
      {
          if ( num % i == 0)
          {
            sum = sum + i;
          }    
      }
     

      return (sum == num);
    }
}