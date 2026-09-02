import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact_prev=factorial(n-1);
        int fact_result=n*fact_prev;

        return fact_result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int n=sc.nextInt();
        System.out.println("Factorial : "+factorial(n));
        sc.close();
    }
}
