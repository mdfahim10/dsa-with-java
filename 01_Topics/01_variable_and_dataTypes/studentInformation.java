import java.util.*;

public class studentInformation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name = sc.nextLine();

        System.out.println("Enter age : ");
        int age = sc.nextInt();

        System.out.println("Enter cgpa : ");
        int cgpa = sc.nextInt();

        sc.nextLine();
        
        System.out.println("Write Gender (M/F) : ");
        String gender = sc.nextLine();

        System.out.println("For placed write true or false for not placed");
        boolean isplaced =sc.nextBoolean();

        System.out.println("========== Student Information ==========");

        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("cgpa : "+cgpa);
        System.out.println("Gender : "+gender);
        System.out.println("Placed : "+isplaced);
    }
}
