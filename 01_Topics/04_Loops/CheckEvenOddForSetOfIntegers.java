import java.util.*;

public class CheckEvenOddForSetOfIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total elements in a set : ");
        int evenSum=0;
        int oddSum=0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num%2==0){
                evenSum=evenSum+num;
            }
            else{
                oddSum=oddSum+num;
            }
        }
        System.out.println("Even sum : "+evenSum);
        System.out.println("Odd sum : "+oddSum);
    }
}
