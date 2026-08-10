import java.util.Arrays;
import java.util.Scanner;
public class InbuiltSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Elements :  ");
        int n = sc.nextInt();
        System.out.println("Enter elements :    ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(" ====== Sorted Array ====== ");
        Arrays.sort(arr);
        //Arrays.sort(arr,0,3) --> sort array from starting index to end index.
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
