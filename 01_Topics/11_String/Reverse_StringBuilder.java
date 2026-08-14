import java.util.*;

public class Reverse_StringBuilder {
    public static void solution(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :  ");
        String str=sc.nextLine();
        solution(str);
    }
}
