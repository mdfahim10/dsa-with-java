import java.util.Scanner;

public class LongestPallindromicSubstring {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void solution(String str) {
        int max = 0;
        String longest = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String current = str.substring(i, j + 1);
                if (isPalindrome(current)) {
                    int length = current.length();
                    if (length > max) {
                        max = length;
                        longest = current;
                    }
                }
            }
        }
        System.out.println("Longest Palindromic Substring : " + longest);
        System.out.println("Length : " + max);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        solution(str);

        sc.close();
    }
}