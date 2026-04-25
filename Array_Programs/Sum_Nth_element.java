// 30. Write a program to find the sum of nth element in a series.

import java.util.Scanner;
public class Sum_Nth_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // Assuming the series is 1, 2, 3, ..., n
        }

        System.out.println("Sum of first " + n + " elements: " + sum);
        sc.close();
    }
}
