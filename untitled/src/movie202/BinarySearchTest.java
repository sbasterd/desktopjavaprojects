package movie202;

import java.util.*;

public class BinarySearchTest {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "ten", "ping"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));
        int result = Collections.binarySearch(list, "white");
        System.out.printf("found index: %d%n", result);
        Collections.sort(list);
        result=Collections.binarySearch(list,"white");
        System.out.printf("sorted list: %s%n",list);
        System.out.printf("found index at: %d%n",result);
    }
}
