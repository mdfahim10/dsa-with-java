import java.util.*;

public class PrimeInRanges {

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

    public static void printPrimesInRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start : ");
        int start = sc.nextInt();
        System.out.print("Enter last : ");
        int last = sc.nextInt();

        printPrimesInRange(start, last);

        sc.close();
    }

}
