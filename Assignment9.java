import java.util.regex.*;
public class Assignment9 {
    public static void main(String[] args) {
        String reg = "^[A-Z].*\\.";
        String s1 = "Good Sentance.";
        String s2 = "bad sentence";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher1 = pattern.matcher(s1);
        Matcher matcher2 = pattern.matcher(s2);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }
}
