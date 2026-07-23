import java.util.*;
public class average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter a number : ");
        int b = sc.nextInt();
        System.out.print("Enter a number : ");
        int c = sc.nextInt();

        int sum = a+b+c;
        double avg = sum/3.0;

        System.out.println("Sum : "+sum);
        System.out.println("Average : "+avg);
    }
}
