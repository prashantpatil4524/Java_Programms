// a 5×5 grid of sequential even numbers.

public class Even_no {
    public static void main(String[] args) {
        int n = 5;
        int x = 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%2d ", x);
                x += 2;
            }
            System.out.println();
        }
    }
}