// 12. Write a program to print the series 2, 4, 6, … n.

class Even_series
{
    public static void main(String a[])
    {
        int n = 10;  // You can change this value to print even numbers up to n

        System.out.println("Even series up to " + n + ":");
        for (int i = 2; i <= n; i += 2)
        {
            System.out.print(i + " ");
        }
    }
}

