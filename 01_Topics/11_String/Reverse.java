import java.util.Scanner;

public class Reverse {
    public static void solution(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :  ");
        String str=sc.nextLine();
        solution(str);
    }
}
