// This program prints an inverted number triangle pattern

class Inverten_no_triangle {
    public static void main(String args[]) {
        int n = 5;  // You can change this value
        
        for(int i = n; i >= 1; i--) {      // Outer loop: controls rows (decreasing)
            for(int j = 1; j <= i; j++) {  // Inner loop: prints numbers from 1 to current row
                System.out.print(j + " ");
            }
            System.out.println();          // Move to next line
        }
    }
}