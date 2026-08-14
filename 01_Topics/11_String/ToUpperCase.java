import java.util.Scanner;

public class ToUpperCase {
    public static void solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0 || str.charAt(i - 1) == ' ') {
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch);
        }
        System.out.println("Output : " + sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        solution(str);
        sc.close();
    }
}