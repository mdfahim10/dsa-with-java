import java.util.*;
public class Largest_elements {
    public static int largest_element(int numbers[], int n){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements :    ");
        int n = sc.nextInt();

        System.out.print("Enter elements :   ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int result = largest_element(arr, n);
        System.out.println("Largest element is : "+result);
    }
}
