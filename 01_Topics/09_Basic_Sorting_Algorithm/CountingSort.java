import java.util.*;
public class CountingSort {
    public static void countingSort(int arr[]){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0 ){
                arr[j]=i;
                j++;
                count[i]--;

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
        countingSort(arr);
    } 
}
