import java.util.*;

public class CountEvenOdd {

    public static void count(int arr[]){
        int even=0;
        int odd=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even=even+1;
            }
            else{
                odd=odd+1;
            }
        }
        System.out.println("Total Even Number in this array : "+even);
        System.out.println("Total Odd Number in this array : "+odd);
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
        count(arr);
        sc.close();
    }
}
