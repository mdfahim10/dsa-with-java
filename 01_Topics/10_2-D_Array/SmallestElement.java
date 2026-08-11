import java.util.*;

public class SmallestElement {

    public static int smallestElement(int matrix[][],int n, int m){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int n=sc.nextInt();
        System.out.print("Enter number of column : ");
        int m=sc.nextInt();

        int matrix[][]=new int[n][m];
        System.out.println("Enter elements  ;   ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(" ======== Array ========");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println("Smallest elements :  "+smallestElement(matrix, n, m));

    }
}