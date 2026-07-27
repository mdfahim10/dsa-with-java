import java.util.*;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int n=num;
        int r;
        int largest =0;

        while(n>0){
            r=n%10;
            if(r>largest){
                largest=r;                
            }
            n=n/10;
        }
        System.out.println("Largest Digit : "+largest);
    }
}
