import java.util.*;

public class GP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term : ");
        int a = sc.nextInt();

        System.out.print("Enter common ratio : ");
        int r = sc.nextInt();

        System.out.print("Enter total term : ");
        int n = sc.nextInt();
        System.out.println("================= A P ================");
        int current = a;
        for(int i =1; i<=n;i++){
            System.out.print("  "+current);
            current=current*r;
        }
        System.out.println();
    }
    
}
