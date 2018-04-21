import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Oldmast {
    private static Formatter output;

    public static void main(String[] args) {
        try {
            openFile();
            writeFile();
            closeFile();
        } catch (SecurityException e) {
            System.out.printf("Permission denied!");
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.out.printf("File is not found..." + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.printf("Invalid input.%n");
        }
    }

    private static void closeFile() {
        if (output != null)
            output.close();
    }

    private static void writeFile() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a sentence:%n");
        while (input.hasNext()) {
            output.format("%s", input.nextLine());

        }
    }

    private static void openFile() throws FileNotFoundException {
        output = new Formatter("D:/saeed/oldmast.txt");

    }
}
