import java.util.Scanner;
public class DecreasingOrder {
    public static void PrintDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+"    ");
        PrintDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :    ");
        int n = sc.nextInt();
        PrintDecreasing(n);
        sc.close();
    }
}
