import java.util.*;

public class SearchInSortedarray {

    public static boolean search(int matrix[][], int n, int m, int key) {

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.println("Key found at cell : " + row + " , " + col);
                return true;
            } else if (matrix[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }

        System.out.println("Key not found!");
        return false;
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

        System.out.println("======== Matrix ========");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.print("Enter element to search : ");
        int key = sc.nextInt();

        search(matrix, n, m, key);

        sc.close();
    }
}