import java.util.*;

public class LinearSearch {

    public static int linearSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array : ");
            int n = sc.nextInt();

            

            int Arr[] = new int[n];
            System.out.print("Enter Array Elements : ");

            for(int i=0; i<n;i++){
                Arr[i]=sc.nextInt();
            }

            System.out.println("Enter Target : ");
            int target = sc.nextInt();

            int index = linearSearch(Arr, target);
            if(index==-1){
                System.out.println("Target not found!");
            }
            else{
                System.out.println("Target is at index : "+index);
            }
            sc.close();

        }
}
