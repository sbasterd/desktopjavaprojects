package movie195;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> lis = new LinkedList<>();
        for (String str : colors) {
            lis.add(str);
        }
        ListIterator<String> listIterator = lis.listIterator(1);
        System.out.println(listIterator.previous());
        /*while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }*/
    }
}
