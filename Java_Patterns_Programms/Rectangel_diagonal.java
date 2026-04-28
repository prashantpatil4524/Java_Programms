// Java program to print rectangle with diagonal

public class Rectangel_diagonal {
    public static void main(String[] args) {
        int i, j;
        int n = 7; // size

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == j || i == n - 1 
                    || j == n - 1 || i + j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}