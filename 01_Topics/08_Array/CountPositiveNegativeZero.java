import java.util.*;

public class CountPositiveNegativeZero {

    public static void count(int arr[]){
        int negative=0;
        int positive=0;
        int zero=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                positive=positive+1;
            }
            else if(arr[i]<0){
                negative=negative+1;
            }
            else{
                zero=zero+1;
            }
        }
        System.out.println("Total Positive Number in this array : "+positive);
        System.out.println("Total Negative Number in this array : "+negative);
        System.out.println("Total Zero in this array : "+zero);
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
