// 9. Write a program to check whether a number is Even or Odd.
import java.util.Scanner;
public class Ever_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }
        sc.close();
    }
}