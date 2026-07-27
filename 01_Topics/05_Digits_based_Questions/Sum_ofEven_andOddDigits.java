import java.util.*;

public class Sum_ofEven_andOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        int r;
        int evenSum=0;
        int oddSum=0;
        while (n > 0) {
            r = n % 10;
            if(r%2==0){
                evenSum=evenSum+r;
            }
            else{
                oddSum=oddSum+r;
            }
            n = n / 10;
        }
        System.out.println("Sum of Even Digits : "+evenSum);
        System.out.println("Sum of Odd Digits : "+oddSum);
    }

}
