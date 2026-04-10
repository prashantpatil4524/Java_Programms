// This program prints a number triangle pattern where the numbers decrease in column order and are aligned to the right.

class Numer_triangle {
    public static void main(String args[]) {
        int n = 5;
        int x = 1;

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print("   "); // 3 spaces
            }
            // Print numbers in decreasing column order
            for (int j = n - 1; j >= i; j--) {
                System.out.printf("%3d", (x - i));
                x++;
            }
            System.out.println();
        }
    }
}