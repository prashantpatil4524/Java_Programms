// 13. Write a program to print the series 1, 3, 6, 10, … n.
class Odd_series
{
    public static void main(String a[])
    {
        int n = 10;  // You can change this value to print the series up to n

        System.out.println("Series up to " + n + ":");
        int sum = 0;
        for (int i = 1; sum <= n; i++)
        {
            sum += i;
            if (sum <= n)
            {
                System.out.print(sum + " ");
            }
        }
    }
}