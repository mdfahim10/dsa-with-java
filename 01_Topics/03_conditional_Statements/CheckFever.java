import java.util.*;
public class CheckFever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperatur : ");
        double temp=sc.nextDouble();

        if(temp>100){
            System.out.println("You have a fever!");
        }
        else{
            System.out.println("You don't have a fever!");
        }
    }
}
