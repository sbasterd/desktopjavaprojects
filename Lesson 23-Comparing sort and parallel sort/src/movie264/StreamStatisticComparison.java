package movie264;

import com.oracle.jrockit.jfr.DurationEvent;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class StreamStatisticComparison {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        long[] values = random.longs(10_000_000, 1, 1001).toArray();
        Instant seperateStart = Instant.now();
        long count = Arrays.stream(values).count();
        long sum = Arrays.stream(values).sum();
        long min = Arrays.stream(values).min().getAsLong();
        long max = Arrays.stream(values).max().getAsLong();
        double average = Arrays.stream(values).average().getAsDouble();
        Instant seperateEnd = Instant.now();
        System.out.println("Calculations performed separately");
        System.out.printf("count: %,d%n", count);
        System.out.printf("sum: %,d%n", sum);
        System.out.printf("min: %,d%n", min);
        System.out.printf("max: %,d%n", max);
        System.out.printf("average: %f%n", average);
        System.out.printf("Total time in milliseconds : %d%n%n", Duration.between(seperateStart, seperateEnd).toMillis());

        LongStream stream1 = Arrays.stream(values);
        System.out.println("Calculating statistics on sequential stream");
        Instant sequentialStart = Instant.now();
        LongSummaryStatistics result1 = stream1.summaryStatistics();
        Instant sequentialEnd = Instant.now();
        displayStatistic(result1);
        System.out.printf("Total time in milliseconds : %d%n%n", Duration.between(sequentialStart, sequentialEnd).toMillis());

        LongStream stream2 = Arrays.stream(values).parallel();
        System.out.println("Calculating statistics on parallel Stream");
        Instant parallelStart = Instant.now();
        LongSummaryStatistics result2 = stream2.summaryStatistics();
        Instant parallelEnd = Instant.now();
        displayStatistic(result2);

        System.out.printf("Total time in milliseconds: %d%n%n", Duration.between(parallelStart, parallelEnd).toMillis());


    }

    private static void displayStatistic(LongSummaryStatistics stats) {
        System.out.println("Statistics");
        System.out.printf("count: %,d%n", stats.getCount());
        System.out.printf("sum: %,d%n", stats.getSum());
        System.out.printf("min: %,d%n", stats.getMin());
        System.out.printf("max: %,d%n", stats.getMax());
        System.out.printf("average: %f%n", stats.getAverage());

    }
}
