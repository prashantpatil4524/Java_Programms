// Java program to print the number triangle pattern

public class Number_traingle {
    public static void main(String args[]) {
        int size = 3; // limit
        int i;
        int j;

        for (i = size; i >= -size; i--) {
            for (j = Math.abs(i); j <= size; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}