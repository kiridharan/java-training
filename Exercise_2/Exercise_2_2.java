package Exercise_2;

public class Exercise_2_2 {

        public static void main(String[] args) {
            Float PIE = 3.14f;
            long fromFloat = PIE.longValue();
            System.out.printf("float value %f, long value %d %n", PIE, fromFloat);
            float number = 444.33f;
            long aValue = (long) number;
            System.out.printf("float value %f, after casting into long %d %n", number, aValue);
            float points = 333.322f;
            long rounded = Math.round(points);
            System.out.printf("float : %f, long : %d %n", points, rounded);
    
    
        }
}
