import java.util.Scanner;

public class Pallindrome {
    public static boolean isPallindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String ;    ");
        String str=sc.nextLine();

        System.out.println(isPallindrome(str));

    }
}
