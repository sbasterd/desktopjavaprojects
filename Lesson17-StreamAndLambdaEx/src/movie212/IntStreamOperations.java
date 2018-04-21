package movie212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.DoublePredicate;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        double[] values = {3.3, 6, 10, 1, 4, 8, 2, 5, 9.3, 7};
       Arrays.stream(values).map(Math::sqrt).sorted().forEach(value -> System.out.printf("%.2f ",value));
        /*System.out.print("original values: ");
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        IntStream.of(values).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.printf("%d ", value);
            }
        });
        System.out.println(IntStream.of(values).summaryStatistics().toString());
        System.out.println();
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());

        System.out.printf("Sum via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));
        System.out.printf("Sum of squares via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y * y));
        System.out.printf("Product via reduce method: %d%n", IntStream.of(values).reduce(1, (x, y) -> x * y));
        System.out.printf("Even values displayed in sorted order: ");
        //IntStream.of(values).filter(value -> value % 2 == 0).sorted().forEach(value -> System.out.printf("%d ", value));
        IntStream.of(values).filter(value -> value % 2 == 0).sorted().forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        System.out.printf("Odd values multiplied by 10 displayed in sorted order: ");
        //IntStream.of(values).filter(value -> value%2==1).sorted().forEach(value -> System.out.printf("%d ",value*10));
        //IntStream.of(values).filter(value -> value % 2 != 0).map(value -> value * 10).sorted().forEach(value -> System.out.printf("%d ", value));
        IntStream.of(values).filter(new IntPredicate() {
            @Override
            public boolean test(int value) {
                if(value%2==0)
                    return false;
                else return true;
            }
        }).map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand*10;
            }
        }).forEach(value -> System.out.printf("%d ",value ));
        System.out.println();
        System.out.printf("%nSum of integers from 1 to 9: %d%n", IntStream.range(1, 9).sum());
        System.out.printf("%nSum of values from 1 to 10: %d%n", IntStream.rangeClosed(1, 10).sum());*/
      /*  DoublePredicate even = value -> value < 9;
        DoublePredicate greater = value -> value > 5;
        double[] values = {1.1, 2.2, 3.3, 4.4, 5.4, 6.3, 7.8, 8.6, 9.3, 10.00};
        DoubleStream.of(values).filter(even.and(greater)).forEach(value -> System.out.printf("%.2f ", value));*/

    }
}
