import java.util.*;

public class SmallestInArray {
    public static int smallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner wsc = new Scanner(System.in);
        System.out.print("Total Array Elemets :");
        int n = wsc.nextInt();

        int Arr[]=new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i =0;i<n;i++){
            Arr[i]=wsc.nextInt();
        }

        int result=smallest(Arr);
        System.out.println("Smallest Element : "+result);


    }
}
