// 19. Write a program to print the Fibonacci series.

import java.util.Scanner;
public class Fibonacchi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b; // Calculate the next term
            a = b; // Update a to b
            b = nextTerm; // Update b to nextTerm
        }

        sc.close();
    }
}