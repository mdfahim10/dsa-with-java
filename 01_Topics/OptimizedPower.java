import java.util.*;

public class OptimizedPower {
    public static int calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower=calculatePower(x, n/2)*calculatePower(x, n/2);

        if(n%2 !=0){
            halfPower=x*halfPower;
        }
        return halfPower;
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
