import java.util.Scanner;
public class LargestString {
    public static String solution(String[] arr) {
        String largest = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() > largest.length()) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Strings : ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter Strings :");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println("Largest String : " + solution(arr));
        sc.close();
    }
}