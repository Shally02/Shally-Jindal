/* problem-1 : 
Create a small calculator which performs operations 
such as Addition, Subtraction, Multiplication and Division using class.
Inputs: a = double, b = double, type of operation = string
*/

public class Problem1 {

    // Define the Calculator class
    public static class Calculator {
        
        // Method to perform addition
        public double add(double a, double b) {
            return a + b;
        }

        // Method to perform subtraction
        public double subtract(double a, double b) {
            return a - b;
        }

        // Method to perform multiplication
        public double multiply(double a, double b) {
            return a * b;
        }

        // Method to perform division
        public double divide(double a, double b) {
            if (b == 0) {
                // Handle division by zero
                System.out.println("Error: Cannot divide by zero.");
                return Double.NaN; // Not a Number
            }
            return a / b;
        }

        // Method to perform the operation based on the type string
        public double performOperation(double a, double b, String operationType) {
            switch (operationType.toLowerCase()) {
                case "addition":
                    return add(a, b);
                case "subtraction":
                    return subtract(a, b);
                case "multiplication":
                    return multiply(a, b);
                case "division":
                    return divide(a, b);
                default:
                    System.out.println("Error: Invalid operation type.");
                    return Double.NaN;
            }
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Example (Addition)
        double result1 = calc.performOperation(10.5, 5.2, "Addition");
        System.out.println("10.5 + 5.2 = " + result1); // Output: 15.7

        // Example (Division)
        double result2 = calc.performOperation(20, 4, "Division");
        System.out.println("20 / 4 = " + result2); // Output: 5.0
    }
}
