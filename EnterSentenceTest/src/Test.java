import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String buffer = "";
        String word;
        while (!(word = scanner.next().trim()).equals("END")) {
            buffer += word + " ";
        }
        System.out.println(buffer);
    }
}
