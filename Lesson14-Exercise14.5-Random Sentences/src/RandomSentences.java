import java.util.Random;

public class RandomSentences {
    private static String[] article;
    private static String[] nouns;
    private static String[] verbs;
    private static String[] preposition;
    private static Random random;

    public static void main(String[] args) {
        article = new String[]{"the", "a", "one", "some", "any"};
        nouns = new String[]{"boy", "girl", "dog", "town", "car"};
        verbs = new String[]{"drove", "jumped", "ran", "walked", "skied"};
        preposition = new String[]{"to", "from", "over", "under", "on"};
        random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomNumber=random.nextInt(5);
            String sentence="";
            sentence+=article[randomNumber]+" ";
            sentence+=nouns[randomNumber]+" ";
            sentence+=preposition[randomNumber]+" ";
            sentence+=verbs[randomNumber];
            System.out.println(sentence);
        }
    }

}
