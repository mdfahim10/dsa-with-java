import java.util.*;

public class SumOfElements {

    public static int Sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Elements : ");
        int n = sc.nextInt();

        int Arr[] = new int[n];
        System.out.println("Enter Elemets : ");
        for(int i=0; i<n;i++){
            Arr[i]=sc.nextInt();
        }
        int result = Sum(Arr);
        System.out.println("Total Sum : " +result);
    }
}
