import java.util.*;

public class create {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int n = sc.nextInt();
        System.out.print("Enter number of column : ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        System.out.println("Enter elements :    ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println(" ======== Your 2-D Array ======== ");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
