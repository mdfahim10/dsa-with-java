import java.util.Scanner;

public class UpdateBit {

    public static int updation(int number,int i,int newBit){

        int result=number & ~(1<<i);

        result = result | (newBit <<i);
        
        return result;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number :    ");
    int number = sc.nextInt();

    System.out.print("Enter Position :    ");
    int i = sc.nextInt();

    System.out.print("Enter new Bit :    ");
    int newBit = sc.nextInt();
    
    System.out.println("Result : "+updation(number, i,newBit));
    
    }
}
