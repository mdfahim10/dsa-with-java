import java.util.*;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int n=num;
        int r;
        int smallest =9;

        while(n>0){
            r=n%10;
            if(r<smallest){
                smallest=r;                
            }
            n=n/10;
        }
        System.out.println("Smallest Digit : "+smallest);
    }
}
