import java.util.Scanner;

public class Extract_a_Substring {
    public static void solution(String str,int start,int end){
        System.out.println("Substring : "+str.substring(start,end));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :  ");
        String str=sc.nextLine();

        System.out.print("Enter start index :   ");
        int start=sc.nextInt();
        System.out.print("Enter end index :   ");
        int end=sc.nextInt();

        System.out.println();
        solution(str,start,end);
    }
}
