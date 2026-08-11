import java.util.*;

public class DiagonalSumOptimized {

    public static int sum(int matrix[][],int n){
        int sum=0;
        for(int i=0;i<n;i++){

            sum+=matrix[i][i];
            if(i!=n-1-i){
                sum+=matrix[i][n-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();

        int matrix[][]=new int[n][n];
        System.out.println("Enter elements  ;   ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(" ======== Array ========");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println("Diagonal Sum :  "+sum(matrix,n));
    }
}
