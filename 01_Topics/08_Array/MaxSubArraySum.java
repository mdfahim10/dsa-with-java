import java.util.*;

public class MaxSubArraySum{

    public static void maximumSubArraySum(int arr[]){

        int currSum=0;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int start = i;

            for(int j=i;j<n;j++){
                int end = j;
                currSum=0;

                for(int k =start;k<=end;k++){
                    currSum=currSum+arr[k];
                }
                if(max<currSum){
                    max=currSum;
                }

            }

        }
        System.out.println("Maximum Subarray Sum : "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Elements :  ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter Elements :    ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }maximumSubArraySum(arr);
        sc.close();
    }
}