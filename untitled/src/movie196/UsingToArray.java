package movie196;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> list = new LinkedList<>(Arrays.asList(colors));
        list.add("white");
        list.add("red");
        System.out.println(list);
        colors = list.toArray(new String[list.size()]);
        for (String str : colors) {
            System.out.printf("%s ", str);
        }
    }
}
