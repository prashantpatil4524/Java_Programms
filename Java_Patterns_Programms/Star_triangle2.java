// * * * * *
//  *     *
//   *   *
//    * *
//     *
// hollow star triangle

class Star_triangle2 {
    public static void main(String args[]) {
        int n = 5;
        int x = 1;
        int y = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j == x || j == y || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            x++;
            y--;
        }
    }
}