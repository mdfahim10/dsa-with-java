import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int n = num;
        int count=0;

        while(n>0){
            n=n/10;
            count ++;
        }

        int temp=num;
        int sum=0;
        while(temp>0){
            int digit =temp%10;
            temp=temp/10;
            sum=sum+(int)Math.pow(digit, count);
        }

        if(sum==num){
            System.out.println(num+" is an Armstrong Number.");
        }
        else{
            System.out.println(num+" is not a  Armstrong Number.");
        }

    }
}
