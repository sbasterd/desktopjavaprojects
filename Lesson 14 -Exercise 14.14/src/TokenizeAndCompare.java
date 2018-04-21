import java.util.ArrayList;
import java.util.List;

public class TokenizeAndCompare {
    public static void main(String[] args) {
        String sentence="I walked down the hall and talked wanted her in my bed";
        String[] tokens=sentence.split(" ");
        List<String> listEdWords=new ArrayList<>();
        for (String string :
                tokens) {
            if(string.toUpperCase().endsWith("ED"))
                listEdWords.add(string);

        }
        System.out.printf("List of words ending with \"ed\": %s%n",listEdWords);
    }
}
