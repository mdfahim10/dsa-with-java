import java.util.*;

public class SumOfAllElements {

    public static int sum(int matrix[][],int n, int m){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=matrix[i][j];
                }
            }
        return sum;
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
        System.out.println("Sum of all elements :  "+sum(matrix, n, m));

    }
}
