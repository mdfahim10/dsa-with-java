import java.util.Scanner;

public class StringLength {
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

        System.out.println("Length of Strings :-  ");

        System.out.println("name    : "+name.length());
        System.out.println("group    : "+group.length());
        System.out.println("department    : "+department.length());
        System.out.println("college    : "+college.length());

    }
}
