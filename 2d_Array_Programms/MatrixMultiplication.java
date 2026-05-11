// Matrix Multiplication

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = { {1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9} };

        int[][] B = { {1, 0, 0},
                       {0, 1, 0},
                       {0, 0, 1} }; // Identity matrix

        int n = A.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Product Matrix:");
        for (int[] row : result) {
            for (int val : row)
                System.out.printf("%4d", val);
            System.out.println();
        }
    }
}