import java.util.*;

public class BinarySearch {

    public static int Search(int num[],int key){

        int start=0;
        int end = num.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total elements : ");
        int n = sc.nextInt();

        int Arr[]= new int[n];
        System.out.println("Enter Element : ");
        for(int i=0;i<n;i++){
            Arr[i]=sc.nextInt();
        }

        System.out.print("Enter Target : ");
        int Target = sc.nextInt();

        int index = Search(Arr, Target);

        if(index == -1){
            System.out.println("Target not found!");
        }else{
            System.out.println("Target found at index : "+index);
        }
    }
}
