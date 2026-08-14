import java.util.*;

public class CountaSpecificCharacter {
    public static int solution(String str,char ch){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :  ");
        String str=sc.nextLine();
        System.out.print("Enter Character : ");
        char ch =sc.next().charAt(0);

        System.out.println("Character "+ch+" appers "+solution(str, ch)+" times");
    }    
}
