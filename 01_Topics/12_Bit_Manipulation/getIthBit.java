import java.util.Scanner;
public class getIthBit {

    public static int ithBit(int number,int i){
        int bit=(number &(1<<i))>>i;
        return bit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter number :    ");
    int number = sc.nextInt();

    System.out.print("Enter Position :    ");
    int i = sc.nextInt();
    
    System.out.println(i+"th bit : "+ithBit(number, i));
    
    }
}
