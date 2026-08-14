import java.util.Scanner;

public class CountCharactersatEvenIndexes {
    public static void solution(String str){
        String output="";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                output+= str.charAt(i);
            }
        }
        System.out.println(output);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :  ");
        String str=sc.nextLine();
        solution(str);
    }
}
