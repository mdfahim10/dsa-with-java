import java.util.*;

public class SumOfDigits {

    public static int sum(int num) {
        int r;
        int sum = 0;
        while (num > 0) {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("Sum of digit of number " + number + " :  " + sum(number));
    }
}
