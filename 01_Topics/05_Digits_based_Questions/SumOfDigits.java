import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int n =num;
        int sum=0;
        int r;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of Digits = "+sum);
    }
}
