import java.util.Scanner;

public class Binary_Shift {
    public static void solution(int a, int b){
        System.out.println("Left Shift  : "+(a << b));
        System.out.println("Right Shift  : "+(a >> b));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int a = sc.nextInt();
        System.out.print("Enter place to shift :    ");
        int b =sc.nextInt();
        solution(a, b);
    }
}
