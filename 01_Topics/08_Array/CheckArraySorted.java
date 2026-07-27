import java.util.*;

public class CheckArraySorted {

    public static void check(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Unsorted Array ");
                return;
            }

            }
            System.out.println("Sorted Array");
            
        }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total ELements : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\n =====    Original Array   =====");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
        check(arr);
        sc.close();
    }
}
