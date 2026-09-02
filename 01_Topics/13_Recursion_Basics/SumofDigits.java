import java.util.Scanner;
public class SumOfDigits {
    public static int summation(int n) {
        if (n < 10) {
            return n;
        }
        int r = n % 10;
        n = n / 10;
        int sumDigits = r + summation(n);
        return sumDigits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Sum: " + summation(n));
        sc.close();
    }
}
