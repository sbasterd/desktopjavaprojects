import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        String text = "Jane's birthday is 05-12-75\n" +
                "Dave's birthday is 11-04-68\n" +
                "John's birthday is 04-28-73\n" +
                "Joe's birthday is 12-17-77\n";
        Matcher matcher=expression.matcher(text);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}
