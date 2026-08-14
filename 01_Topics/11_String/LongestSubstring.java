import java.util.Scanner;

public class LongestSubstring {
    public static void solution(String str){
        int max=0;
        String longest="";
        int n=str.length();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String current = str.substring(i,j+1);
                int length=current.length();
                if(length>max){
                    max=length;
                    longest=current;
                }
            }
        }
        System.out.println("Longest Substring : " + longest);
        System.out.println("Length : " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String  :   ");
        String str = sc.nextLine();
        solution(str);
        sc.close();
    }
}
