import java.util.Scanner;

public class RevereseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] tokens = sentence.split(" ");
        for(int i=tokens.length-1;i>=0;--i){
            System.out.print(tokens[i]+" ");
        }
    }
}
