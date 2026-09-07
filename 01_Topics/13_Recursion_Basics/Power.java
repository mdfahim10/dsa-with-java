import java.util.*;

public class Power {
    public static int calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * (calculatePower(x, n - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :    ");
        int x = sc.nextInt();

        System.out.print("Enter power : ");
        int n = sc.nextInt();

        System.out.println("Result :    " + calculatePower(x, n));
    }
}
