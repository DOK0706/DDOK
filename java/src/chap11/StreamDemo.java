package chap11;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java8", "Lambdas", "SangHyun");
        stream.map(String::toUpperCase).forEach(System.out::println);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(numbers).sum());

        Stream.iterate(0, n -> n+2)
                .limit(5)
                .forEach(System.out::println);

        IntStream.generate(()->1)
                .limit(5)
                .forEach(System.out::println);
    }
}
