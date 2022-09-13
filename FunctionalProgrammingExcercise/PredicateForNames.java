package FunctionalProgrammingExcercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Predicate<String> predicate = s -> s.length() > length;
        names.removeIf(predicate);

        names.forEach(System.out::println);

        // Other way
//        Predicate<String> predicate2 = s -> s.length() <= length;
//        names.stream().filter(predicate2).forEach(System.out::println);
    }
}
