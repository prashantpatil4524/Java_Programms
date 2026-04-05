// 11. Write a program to print the series 1, 2, 3, … n.

import java.util.Scanner;
public class Number_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("The series is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}