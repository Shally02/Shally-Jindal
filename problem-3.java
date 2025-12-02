import java.util.ArrayList;
import java.util.List;

public class problem {

    public static List<Integer> generateOddSeries(int x) {
        if (x <= 0) {
            return new ArrayList<>();
        }

        List<Integer> series = new ArrayList<>();

        // The nth odd number is given by the formula: 2*n - 1

        if(x % 2 != 0){ //odd case
            for (int n = 1; n <= x; n++) {
                int oddNumber = (2 * n) - 1;
                series.add(oddNumber);
            }
        }else if(x % 2 == 0){ //even case
            for (int n = 1; n < x; n++) {
                int oddNumber = (2 * n) - 1;
                series.add(oddNumber);
            }
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

        // Example: input a = 7
        int inputC = 0;
        List<Integer> output3 = generateOddSeries(inputC);
        System.out.println("Input a = " + inputC + ", Output: " + output3);

        // Example: input a = 7
        int inputD = 1;
        List<Integer> output4 = generateOddSeries(inputD);
        System.out.println("Input a = " + inputD + ", Output: " + output4);


    }
}
