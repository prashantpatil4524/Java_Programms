// 10. Write a program to check whether a number is Positive or Negative.
import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is a Positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}