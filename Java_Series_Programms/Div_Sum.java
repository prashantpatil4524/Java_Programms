// 16. Write a program to find the sum of the series 1/2 + 2/3 + 3/4 + … n.

public class Div_Sum {
    public static void main(String args[]) {
        int n = 10; // size of the series
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1); // Add each term of the series
        }

        System.out.println("The sum of the series is: " + sum);
    }
}