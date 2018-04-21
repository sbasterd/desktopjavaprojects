package movie205;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        String[] colors={"yellow","green","black","tan","grey","white","orange","red","green"};
        SortedSet<String> tree=new TreeSet<>(Arrays.asList(colors));
        System.out.printf("sorted set: %s%n",tree);
        System.out.println("headSet(\"orange\")");
        System.out.printf("%s%n",tree.headSet("orange"));
        System.out.println("tailSet(\"orange\")");
        System.out.printf("%s%n",tree.tailSet("orange"));
    }
}
