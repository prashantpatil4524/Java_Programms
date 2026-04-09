// 15. Write a program to print the series 1 – 2 + 3 – 4 + 5 – 6 … n.
public class Sub_add {
    public static void main(String args[]) {
        int n = 20; // size of the series
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i; // Subtract even numbers
            } else {
                sum += i; // Add odd numbers
            }
        }

        System.out.println("The result of the series is: " + sum);
    }
}