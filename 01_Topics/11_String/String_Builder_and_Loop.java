

public class String_Builder_and_Loop {
    public static void main(String[] args) {

        String str ="ABC";
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
