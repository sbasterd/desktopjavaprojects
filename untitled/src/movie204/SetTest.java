package movie204;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "cyan", "peach", "gray", "orange"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));
        printNonDuplicate(list);
    }

    private static void printNonDuplicate(List<String> list) {
        Set<String> set = new HashSet<>(list);
        System.out.printf("non-duplicate: %s%n", set);
    }
}
