// Right Triangle Number Pattern (Inverted Left-Aligned)

public class Triangle {
    public static void main(String args[]) {
        int n = 5; // size

        for (int i = n; i >= 1; i--) {
            // Print spaces for right alignment
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
            // Print numbers from 1 to i
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}