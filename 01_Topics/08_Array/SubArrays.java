import java.util.*;
public class SubArrays {

    public static void printSubArray(int arr[]){
        int totalsubarray=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int start = i;

            for(int j=i;j<n;j++){
                int end = j;

                for(int k =start;k<=end;k++){
                    System.out.print(arr[k]+"   ");
                }
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub array : "+totalsubarray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Elements :  ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter Elements :    ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }printSubArray(arr);
        sc.close();


    }
    
}
