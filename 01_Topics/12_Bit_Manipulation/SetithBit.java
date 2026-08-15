import java.util.Scanner;

public class SetithBit {

    public static int ithBit(int number,int i){

        return number | (1<<i);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number :    ");
    int number = sc.nextInt();

    System.out.print("Enter Position :    ");
    int i = sc.nextInt();
    
    System.out.println("Result : "+ithBit(number, i));
    
    }
}
