package movie197;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort3 {
    public static void main(String[] args) {
        List<Time2> timeList = new ArrayList<>();
        timeList.add(new Time2(6, 24, 34));
        timeList.add(new Time2(18, 14, 58));
        timeList.add(new Time2(6, 05, 34));
        timeList.add(new Time2(12, 14, 58));
        timeList.add(new Time2(6, 24, 22));

        System.out.printf("Unsorted array elements: %n%s%n", timeList);
        Collections.sort(timeList, new TimeComparator().reversed());
        System.out.printf("Sorted list elements:%n%s%n", timeList);
    }
}
