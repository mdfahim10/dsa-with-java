import java.util.*;
class ASCII{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character inside single quote :  ");
        char ch = sc.next().charAt(0);

        System.out.println("Character : " + ch);
        System.out.println("ASCII : " + (int)ch);

        sc.close();
    }
}