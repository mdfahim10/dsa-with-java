import java.util.*;

public class BinomialCoefficient {

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact= fact*i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        System.out.print("Enter r :");
        int r=sc.nextInt();

        int r1= factorial(n);
        int r2= factorial(r);
        int r3= factorial(n-r);

        int c=r1/(r2*r3);
        System.out.println("Coefficient : "+c);


    }
}
