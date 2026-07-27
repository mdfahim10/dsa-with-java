import java.util.*;

public class ProductOfDigit {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int n =num;
        int product=1;
        int r;
        while(n>0){
            r=n%10;
            product=product*r;
            n=n/10;
        }
        System.out.println("Product of Digits = "+product);
    }
}
