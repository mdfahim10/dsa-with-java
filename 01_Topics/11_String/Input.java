import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name=sc.nextLine();

        System.out.print("Enter Your Lab Group : ");
        String group=sc.nextLine();

        System.out.print("Enter Your Department : ");
        String department=sc.nextLine();

        System.out.print("Enter Your Name : ");
        String college=sc.nextLine();

        System.out.println("\n Name :  "+name+"\n Lab Group;   "+group+"\n Department :    "+department+"\n College : "+college);

    }

    
}
