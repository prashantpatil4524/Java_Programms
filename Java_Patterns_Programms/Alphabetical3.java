// Diagonal Alphabet Pattern

class Alphabetical3
{
    public static void main(String args[])
    {
        int n = 5;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print((char)(i + j + 65));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}