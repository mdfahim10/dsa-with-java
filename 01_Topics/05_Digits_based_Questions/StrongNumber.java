import java.util.*;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int n = number;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (sum == number) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is Not a Strong Number.");
        }
        sc.close();
    }
}