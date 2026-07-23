public class PrecedenceDemo {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        int result = a + b * 2 - 4 / 2; 
        /*
             5+3*2-2
             5+6-2
             11-2
             9
        */

        System.out.println(result);
    }
}