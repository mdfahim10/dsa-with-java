import java.util.Scanner;

public class Sumof_Even {

    public static int summation(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n % 2 != 0) {
            n = n - 1;
        }
        int prev_sum = summation(n - 2);
        int result = n + prev_sum;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :  ");
        int n = sc.nextInt();
        System.out.println("Sum :   " + summation(n));
        sc.close();
    }
}
