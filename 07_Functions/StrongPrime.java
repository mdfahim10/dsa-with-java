import java.util.*;

public class StrongPrime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        int r;
        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isStrongPrime(int n) {
        if (!isPrime(n)) {
            return false;
        }
        int digitSum = sumOfDigits(n);
        return isPrime(digitSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        if (isStrongPrime(number)) {
            System.out.println(number + " is a Strong Prime Number.");
        } else {
            System.out.println(number + " is NOT a Strong Prime Number.");
        }

        sc.close();

    }
}
