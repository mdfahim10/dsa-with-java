import java.util.Scanner;

public class SumOfFirst_n_Natural {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int a = sum(n-1);
        return n+a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
