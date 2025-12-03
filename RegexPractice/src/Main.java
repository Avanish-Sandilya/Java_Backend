import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");  // one or more digits
        Matcher matcher = pattern.matcher("Age: 29");

        if (matcher.find()) {
            System.out.println(matcher.group()); // 29
        }

        System.out.println("=============");

        Pattern p = Pattern.compile("^\\d{6}$");
        Matcher matcher1=p.matcher("2233445");

        System.out.println(matcher1.find());

    }
}
