import java.util.*;

public class Sum {

    public static int calculateSum(int num1,int num2){ //num1 & num2 -->Parameters
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();           //input a

        System.out.print("Enter b : ");
        int b = sc.nextInt();           //input a

        int result=calculateSum(a, b);     //calling function with arguments a & b
        System.out.println("Sum : "+result);
    }
}
