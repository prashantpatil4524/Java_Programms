// 23. Write a program to find the sum of the cubes of digits of a number.

import java.util.Scanner;

public class Sum_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sumOfCubes = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10; // Get the last digit
            sumOfCubes += Math.pow(digit, 3); // Add the cube of the digit to the sum
            temp /= 10; // Remove the last digit
        }

        System.out.println("The sum of the cubes of the digits of " + number + " is: " + sumOfCubes);
    }
}   




