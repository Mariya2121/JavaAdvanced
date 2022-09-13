package FunctionalProgrammingExcercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Consumer<List<String>> printer = names -> names.forEach(name -> System.out.println("Sir " + name));
        printer.accept(list);

    }

}
