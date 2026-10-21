import java.util.*;
public class bruteforce {

    public static int[] sum(int arr[], int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]= {2,7,9,11};
        int target = 9;

        int result[]=sum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
