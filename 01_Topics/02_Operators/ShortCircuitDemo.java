public class ShortCircuitDemo {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        if (a > b && ++a > 5) {
            System.out.println("Hello");
        }

        System.out.println(a);
    }
}