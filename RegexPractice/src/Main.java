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

        System.out.println("=============");

        String text = "Learning Java is fun! #java #codingLife #100DaysOfCode";

        Pattern pattern2 = Pattern.compile("#\\w+");
        Matcher matcher2 = pattern2.matcher(text);

        while (matcher2.find()){
            System.out.println(matcher2.group());
        }

        System.out.println("=================");

        String str ="Price: Rs 199, Discount: 10%";
        Pattern p3 = Pattern.compile("\\d+");
        Matcher m3 = p3.matcher(str);

        while (m3.find()){
            System.out.println(m3.group());
        }

        System.out.println("===================");
        Pattern p4 = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)\\S{8,}$");
        Matcher m4 = p4.matcher("superMan@124");

        System.out.println(m4.matches());  // true

        System.out.println("======================");

        String line = "Hello, what are you doing, hi hi hi.".replaceAll("[^A-Za-z]+"," ").trim();
        System.out.println(line);

    }
}
