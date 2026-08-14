import java.util.Scanner;

public class Practice2 {
    public static void solution(String input,int index){
        System.out.println("The Character at index "+index+" of the string "+input+" is "+input.charAt(index));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :  ");
        String input=sc.nextLine();

        System.out.print("Enter index :  ");
        int index=sc.nextInt();

        solution(input,index);
    }
}
