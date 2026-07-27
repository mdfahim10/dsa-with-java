import java.util.*;

public class Pallindrome {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();

        int n=num;
        int r;
        int rev=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==num){
            System.out.println(num+" is Pallindrome ");
        }
        else{

            System.out.println(num+" is not Pallindrome ");
        }


    }
}
