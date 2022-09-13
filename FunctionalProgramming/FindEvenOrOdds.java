package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvenOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String condition = scanner.nextLine();
        int low = range[0];
        int up = range[1];


        // rangeClosed - included low and up
        System.out.println(IntStream.rangeClosed(low, up).boxed().filter(getPredicate(condition))
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }

    public static Predicate<Integer> getPredicate(String condition) {
        if (condition.equals("odd")) {
            return n -> n % 2 != 0;
        } else {
            return n -> n % 2 == 0;
        }
    }
}
