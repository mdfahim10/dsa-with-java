import java.util.Scanner;

public class Print_All_Substring {

    public static void solution(String str){
        int n=str.length();
        System.out.println("Total substring : "+(n*(n+1))/2);
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(str.substring(i,j+1));
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String  :   ");
        String str = sc.nextLine();
        solution(str);
        sc.close();
    }
}
