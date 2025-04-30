import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPresentation {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a&k", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("A&K Academy is the best!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}