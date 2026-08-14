import java.util.Scanner;


public class Practice1 {

    public static void solution(String input){
        System.out.println("First Character :   "+input.charAt(0));
        System.out.println("Last Character :   "+input.charAt(input.length()-1));
        System.out.println("Length :    "+input.length());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :  ");
        String input=sc.nextLine();
        solution(input);
    }
}
