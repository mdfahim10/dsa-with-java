public class LogicalDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println(a == c);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a <= c);

        System.out.println((a == c) && (b > a));
        System.out.println((a > b) || (a == c));
        System.out.println(!(a == c));
    }
}