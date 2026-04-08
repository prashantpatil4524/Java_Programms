// 14. Write a program to find the sum of the series 1 + 2 + 3 + … + n.
import java.util.Scanner;
class Seried_Addition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++)
        {
            sum += i;
        }

        System.out.println("The sum of the series 1 + 2 + ... + " + n + " is: " + sum);
    }
}