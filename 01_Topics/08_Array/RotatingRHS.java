import java.util.*;

public class RotatingRHS {

    public static void Rotation(int A[]){
        int n=A.length;

        int temp=A[n-1];
        for(int i=n-2;i>=0;i--){
            A[i+1]=A[i];
        }
        A[0]=temp;

        System.out.println("======== After Rotation ========");

        for(int i=0;i<n;i++){
            System.out.print(A[i]+"    ");
        }

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Total Elements : ");
        int n = sc.nextInt();

        int arr[] = new int [n];
        System.out.println("Enter Element : ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("======== Original Array ========");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"    ");
        }
        System.out.println();
        Rotation(arr);

    }
}
