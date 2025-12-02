 // Problem-2.java
 // With a single integer 'a' as the input, generate the series: 1, 3, 5, 7, ... 
 // until a = x (where x is the number of terms).
 
import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static List<Integer> generateOddSeries(int x) {
        if (x <= 0) {
            return new ArrayList<>();
        }

        List<Integer> series = new ArrayList<>();
        
        // The nth odd number is given by the formula: 2*n - 1
        for (int n = 1; n <= x; n++) {
            int oddNumber = (2 * n) - 1;
            series.add(oddNumber);
        }
        
        return series;
    }

    public static void main(String[] args) {
        // Example: input a = 4, output: 1, 3, 5, 7
        int inputA = 4;
        List<Integer> output1 = generateOddSeries(inputA);
        System.out.println("Input a = " + inputA + ", Output: " + output1); 

        // Example: input a = 7
        int inputB = 7;
        List<Integer> output2 = generateOddSeries(inputB);
        System.out.println("Input a = " + inputB + ", Output: " + output2); 
    }
}
