package Exercise_2;

public class Exercise_1_2 {
    
    public static float root(int number) {
        if (number < 0)
          return -1;
        if (number == 0 || number == 1)
          return number;
        float root = 0.0f;
        float precision = 0.1f;
        float square = root;
        while (square < number) {
          root = root + precision;
          square = root * root;
        }
        return root;
      }
      public static void main(String[] args) {
        int num = 9;
        System.out.println("The square root of " + num + " is " + root(num));
      }
}