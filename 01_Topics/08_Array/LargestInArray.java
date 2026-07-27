import java.util.*;


public class LargestInArray {

    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter Total Elemets : ");
        int n = sc.nextInt();

        int Arr[]=new int[n];
        System.out.println("Enter Elements : ");
        for(int i =0;i<n;i++){
            Arr[i]=sc.nextInt();
        }

        int result = largest(Arr);
        System.out.println("Largest Elemts : "+result);

    }
}
