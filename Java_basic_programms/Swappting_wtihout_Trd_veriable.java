// 7. Write a program to swap two numbers without using a third variable.
import java.util.Scanner;
public class Swappting_wtihout_Trd_veriable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a third variable
        a = a + b; // Step 1: a now holds the sum of a and b
        b = a - b; // Step 2: b now holds the original value of a
        a = a - b; // Step 3: a now holds the original value of b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}