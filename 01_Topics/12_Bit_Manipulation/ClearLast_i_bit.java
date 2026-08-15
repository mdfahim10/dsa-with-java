import java.util.Scanner;

public class ClearLast_i_bit {
    public static int solution(int number, int i){
        int mask =~((1<<i)-1);
        int result=(number & mask); 
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :    ");
        int number = sc.nextInt();

        System.out.print("Enter i : ");
        int i=sc.nextInt();
        System.out.println("Result :  "+solution(number, i));

    }
}
