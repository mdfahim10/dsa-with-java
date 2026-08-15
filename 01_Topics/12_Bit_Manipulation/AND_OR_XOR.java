import java.util.Scanner;

public class AND_OR_XOR {
    public static void solution(int a, int b){
        System.out.println("Binary AND  : "+(a&b));
        System.out.println("Binary OR  : "+(a|b));
        System.out.println("Binary XOR  : "+(a^b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int a = sc.nextInt();
        System.out.print("Enter another number :    ");
        int b =sc.nextInt();
        solution(a, b);
    }

}
