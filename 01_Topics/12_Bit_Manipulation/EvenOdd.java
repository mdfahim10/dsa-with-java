import java.util.Scanner;

public class EvenOdd {

    public static void solution(int n){
        if((n & 1)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :    ");
        int n=sc.nextInt();

        solution(n);

    }
}
