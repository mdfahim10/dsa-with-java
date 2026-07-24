import java.util.*;

public class FrequencyOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.print("Enter digit to count the frequency : ");
        int d=sc.nextInt();
        int n = num;
        int r;
        int count =0;
        while (n > 0) {
            r = n % 10;
            if (r ==d) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Frequency of "+num+" is "+count);
    }
}
