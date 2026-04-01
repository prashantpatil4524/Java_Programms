// 2. Write a program to find the Average of numbers.
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            sum += sc.nextDouble();
        }
        double average = sum / n;
        System.out.println("The average is: " + average);
        sc.close();
    }
}