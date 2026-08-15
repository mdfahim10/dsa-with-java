import java.util.Scanner;

public class XOR_Cancel {
    public static void solution(int a, int b, int c, int d, int e, int f, int g, int h, int i){
        
        System.out.println("Binary XOR  : "+(a^b^c^d^e^f^g^h^i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int a = sc.nextInt();
        System.out.print("Enter another number :    ");
        int b =sc.nextInt();
        System.out.print("Enter another number :    ");
        int c =sc.nextInt();
        System.out.print("Enter another number :    ");
        int d =sc.nextInt();
        System.out.print("Enter another number :    ");
        int e =sc.nextInt();
        System.out.print("Enter another number :    ");
        int f =sc.nextInt();
        System.out.print("Enter another number :    ");
        int g =sc.nextInt();
        System.out.print("Enter another number :    ");
        int h =sc.nextInt();
        System.out.print("Enter another number :    ");
        int i =sc.nextInt();

        solution(a, b, c, d, e, f, g, h, i);

        
    }
}
