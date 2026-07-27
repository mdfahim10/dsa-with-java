import java.util.*;

public class MaximumDifference {

    public static int largest(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int smallest(int arr[]){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
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
        int max=largest(arr);
        int min=smallest(arr);

        int difference=max-min;
        System.out.println("Maximum Difference : "+difference);
        sc.close();
    }
}
