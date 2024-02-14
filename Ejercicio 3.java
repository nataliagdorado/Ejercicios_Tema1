import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;
        
        int[] multiplesOfFive = getMultiplesOfFive(begin, end);
        int sum = getSum(multiplesOfFive);
        
        System.out.println("Multiples of 5: " + Arrays.toString(multiplesOfFive));
        System.out.println("Sum: " + sum);
    }
    
    public static int[] getMultiplesOfFive(int begin, int end) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }
        
        int[] multiples = new int[count];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiples[index] = i;
                index++;
            }
        }
        
        return multiples;
    }
    
    public static int getSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
