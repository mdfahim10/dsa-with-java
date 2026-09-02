import java.util.Scanner;
public class Fibonacci_Nth_term {
    public static int fibonacci_n(int n) {
        if (n == 0 || n==1) {
            return n;
        }
        int fib_nm1 = fibonacci_n(n - 1);
        int fib_nm2 = fibonacci_n(n - 2);
        int fib_n = fib_nm1 + fib_nm2;
        return fib_n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term :  ");
        int n = sc.nextInt();
        System.out.println(n + "th Fibonacci term    :" + fibonacci_n(n));
        sc.close();
    }
}
