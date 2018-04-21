import java.util.Scanner;

public class Tokenize {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String telephoneNumber = scanner.nextLine();

        if (checkRegex(telephoneNumber)) {

            String[] tokendWithSpace = telephoneNumber.split(" ");
            String areaCode = tokendWithSpace[0];
            String[] sevenDigits = tokendWithSpace[1].split("-");
            String firstThree = sevenDigits[0];
            String lastFour = sevenDigits[1];
            System.out.printf("%nArea code: %s%nFirst three digits: %s%nLast Four digits: %s%n", areaCode, firstThree, lastFour);
        }
        else
            System.out.println("Invalid phone number");

    }


    public static boolean checkRegex(String str) {
        //language=RegExp
        String reg = "[1-9]\\d\\d\\s[1-9]\\d\\d-\\d{4}";
        return str.matches(reg);
    }
}
