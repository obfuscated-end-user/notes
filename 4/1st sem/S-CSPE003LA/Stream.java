import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("sequential");
        numbers.stream().forEach(number ->
            System.out.println(number)
        );

        System.out.println("\nparallel");
        numbers.parallelStream().forEach(number ->
            System.out.println(number)
        );
    }
}

/*
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        System.out.println("sequential");
        IntStream.rangeClosed(1, 10).forEach(System.out::println);

        System.out.println("\nparallel");
        IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
    }
}
*/