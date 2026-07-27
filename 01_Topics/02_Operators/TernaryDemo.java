public class TernaryDemo {
    public static void main(String[] args) {

        int age = 18;

        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);     //Adult

        int num = -5;

        String answer = (num > 0) ? "Positive" : "Negative";

        System.out.println(answer);     //Negative
    }
}