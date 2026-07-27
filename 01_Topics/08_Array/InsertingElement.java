import java.util.*;

public class InsertingElement {

    public static void insert(int arr[],int size,int element, int index){

        for(int i=size-1;i>=index;i--){
            arr[i+1]=arr[i];
        }

        arr[index]=element;
        
        System.out.println("\n======== Updated Array ========");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"    ");
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Total Elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n+1];
        System.out.println("Enter Element : ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter elment to insert : ");
        int element=sc.nextInt();

        System.out.print("Enter index : ");
        int index=sc.nextInt();

        System.out.println("\n======== Original Array ========");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"    ");
        }

        insert(arr,n, element, index);
    }
}
