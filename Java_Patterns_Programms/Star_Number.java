// Java program to print the pattern of stars and numbers in a 5x5 grid.

class Star_Number
{
    public static void main(String args[])
    {
        int n = 5;
        char x = 'A';

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if ((i + j) % 2 == 1)
                {
                    System.out.print(x + " ");
                    x++;
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}