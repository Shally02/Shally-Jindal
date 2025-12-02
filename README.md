# Shally-Jindal
Coding Test Solutions - This repository contains my solutions for the four simple coding problems, as requested for the test.

Programming Language Used : The problems were solved using Java.

Comments on Solutions: 

Problem 1: Small Calculator (Class Implementation)
The solution uses a Java class named Calculator to encapsulate the functions. It includes separate methods for add, subtract, multiply, and divide. A main method, performOperation, handles the input string to direct the calculation to the correct internal method, including basic handling for division by zero.

Problem 2: Series Generation (1, 3, 5, 7, ...)
The solution generates the first x terms of the positive odd number sequence using the formula: 2n - 1 within a loop that runs x times.

Problem 3: Series Generation (Specific Pattern)
The solution generates the first x terms of the positive odd number sequence using the formula: 2n - 1 within a loop that runs x times for odd case and x-1 times in case of even numbers.

Problem 4: Get Count of Multiples (Dictionary/Map)
The goal is to count how many numbers in the input list are multiples of each integer from 1 to 9.

The solution uses a Java HashMap to store the results, mapping the divisor (1 through 9) to its count.
It uses nested loops:
  The outer loop iterates through every number in the input list.
  The inner loop iterates through the divisors 1 through 9.
The count is incremented if the modulo operation (number % divisor == 0) returns zero, indicating the number is a multiple of the divisor.
