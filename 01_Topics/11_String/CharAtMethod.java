import java.util.Scanner;


public class CharAtMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your favourite Super Hero name: ");
        String superHero=sc.nextLine();

        for(int i=0;i<superHero.length();i++){
            System.out.println("index : "+i+"   Character : "+superHero.charAt(i));
        }

        sc.close();
    }
}
