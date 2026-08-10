import java.util.*;
public class InsertionSort {

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int curr=arr[i+1];
            int prev=i;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;

                arr[prev+1]=curr;
            }
        }
        System.out.println("========== Sorted Array ==========");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Elements :  ");
        int n = sc.nextInt();
        System.out.println("Enter elements :    ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
    }
}
