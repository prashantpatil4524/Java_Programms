// 20. Write a program to find the Sum of digits of a number.

import java.util.Scanner;
public class Sun_of_digit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        int temp = num; // Store the original number for display
        
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            num /= 10; // Remove the last digit
        }
        
        System.out.println("The sum of digits of " + temp + " is: " + sum);
        
        sc.close();
    }
}