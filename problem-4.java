/**
 * Problem-4: 
 * Get the total count of numbers listed in the dictionary
 * which is multiple of [1, 2, 3, 4, 5, 6, 7, 8, 9].
 * Output: Dictionary/Map of {Divisor: Count}.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem3 {

    public static Map<Integer, Integer> countMultiples(List<Integer> inputList) {

        // Initialize the result map with keys 1 through 9, and values 0
        Map<Integer, Integer> resultCount = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            resultCount.put(i, 0);
        }

        // Define the divisors to check (1 to 9)
        List<Integer> divisors = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Outer loop: Iterate through each number in the input list
        for (int number : inputList) {

            // Inner loop: Check against each divisor from 1 to 9
            for (int divisor : divisors) {

                // Check for multiplicity:
                if (number % divisor == 0) {
                    // Increment the count for this divisor
                    resultCount.put(divisor, resultCount.get(divisor) + 1);
                }
            }
        }

        return resultCount;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

        Map<Integer, Integer> output = countMultiples(input);
        System.out.println("Input List: " + input);
        System.out.println("Output: " + output);

    }
}

