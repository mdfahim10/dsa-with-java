import java.util.Scanner;

public class IncreasingOrder {
    public static void PrintIncreasing(int n) {
        if (n == 1) {
            System.out.print(n + "  ");
            return;
        }

        PrintIncreasing(n - 1);
        System.out.print(n + "  ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :    ");
        int n = sc.nextInt();
        PrintIncreasing(n);
        System.out.println();
        sc.close();
    }
}
