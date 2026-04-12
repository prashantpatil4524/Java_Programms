// Number Right-Aligned Hollow Number Diamond 

class Pyramid_pattern2 {
    public static void main(String args[]) {
        int size = 3;
        int i, j, k;

        for (i = size; i >= -size; i--) {
            // Print spaces
            for (j = 0; j < Math.abs(i); j++) {
                System.out.print("  ");
            }
            // Print numbers starting from abs(i) to size
            for (k = Math.abs(i); k <= size; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}