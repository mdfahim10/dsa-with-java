import java.util.Scanner;

public class StringCompression {
    public static void solution(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() &&
                   str.charAt(i + 1) == ch) {
                count++;
                i++;
            }
            sb.append(ch);
            sb.append(count);
            i++;
        }
        System.out.println("Compressed String : " + sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        solution(str);
        sc.close();
    }
}