import java.util.*;

public class SpiralMatrix {

    public static void spiral(int matrix[][], int n, int m) {

        int startrow = 0;
        int endrow = n - 1;
        int startcolumn = 0;
        int endcolumn = m - 1;

        while (startrow <= endrow && startcolumn <= endcolumn) {

            // Top → Right
            for (int j = startcolumn; j <= endcolumn; j++) {
                System.out.print("  " + matrix[startrow][j]);
            }

            // Right → Bottom
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print("  " + matrix[i][endcolumn]);
            }

            // Bottom → Left
            for (int j = endcolumn - 1; j >= startcolumn; j--) {
                System.out.print("  " + matrix[endrow][j]);
            }

            // Left → Top
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                System.out.print("  " + matrix[i][startcolumn]);
            }

            // Shrink boundaries
            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("======== Array ========");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("\n======== Spiral Order ========");

        spiral(matrix, n, m);

        sc.close();
    }
}