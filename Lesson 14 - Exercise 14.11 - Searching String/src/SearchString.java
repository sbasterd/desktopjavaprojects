import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence="";
        String word="";
        System.out.println("Enter a sentence: ");
        while (!word.equals("quit")) {
            sentence += word;
            sentence+=" ";
            word=input.next();

        }
        Scanner ne=new Scanner(System.in);
        System.out.println("Enter the character you want to check: ");
        char ch = ne.next().charAt(0);
        int numberOfOccurrences = determineTheNumberOfOccurrences(ch, sentence);
        System.out.println("The number of occurrences: " + numberOfOccurrences);


        //System.out.printf("The number of occurrences of character h is %d",count);
    }

    public static int determineTheNumberOfOccurrences(char c, String sentence) {
        int count = 0;
        int tempIndex = 0;
        int index = 0;
        while (tempIndex != -1) {
            count++;
            tempIndex = sentence.indexOf('h', index);
            index = tempIndex + 1;
        }
        return count-1;
    }
}
