import java.util.*;
public class CheckInteger{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer : ");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Positive Integer");
        }
        else if(n<0){
            System.out.println("Negative Integer");
        }
        else{
            System.out.println("Zero");
        }
    }
}