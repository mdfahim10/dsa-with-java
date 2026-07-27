import java.util.Scanner;

public class CheckPallindrome {

    public static void pallindrome(int num){
        int r;
        int n=num;
        int rev=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==num){
            System.out.println("Pallindrome Number");
        }
        else{
            System.out.println("Not a Pallindrome Number");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();
        pallindrome(number);

    }
}
