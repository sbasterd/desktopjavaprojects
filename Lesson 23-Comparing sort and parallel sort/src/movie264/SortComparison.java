package movie264;

import java.security.SecureRandom;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class SortComparison {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int[] array1 = secureRandom.ints(15_000_000).toArray();
        int[] array2 = new int[array1.length];
        System.arraycopy(array1, 0, array2, 0, array1.length);
        System.out.println("starting sort");
        Instant sortStart = Instant.now();
        System.out.printf("Start time: %s%n",sortStart);
        Arrays.sort(array1);
        Instant sortEnd = Instant.now();
        System.out.printf("End time: %s%n",sortEnd);
        long sortTime = Duration.between(sortStart, sortEnd).toMillis();
        System.out.printf("Total time in Miliseconds: %d%n%n", sortTime);

        System.out.println("Starting parallel sort");
        Instant parallelStart = Instant.now();
        Arrays.sort(array2);
        Instant parallelEnd = Instant.now();

        long parallelSortTime = Duration.between(parallelStart, parallelEnd).toMillis();
        System.out.printf("Total Time in milliseconds: %d%n%n", parallelSortTime);
        String percentage = NumberFormat.getPercentInstance().format((double) sortTime / parallelSortTime);
        System.out.printf("%nsort took %s more time than parallel sort%n", percentage);
    }
}
