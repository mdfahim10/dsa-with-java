import java.util.Scanner;

public class SumOf_n_Numbers {

    public static int summation(int n) {
        if(n==1){
            return 1;
        }
        int prev_sum = summation(n - 1);
        int result=n+prev_sum;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :  ");
        int n = sc.nextInt();
        System.out.println("Sum :   "+summation(n));
        sc.close();
    }
}
