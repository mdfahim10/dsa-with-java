import java.util.*; 
public class PairsArray {

    public static void printPairs(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int curr=arr[i];
            for(int j=i+1;j<n;j++){
                System.out.print("(" + curr + ", " + arr[j] + ") ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Elements :  ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter Elements :    ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }printPairs(arr);
        sc.close();


    }
}
