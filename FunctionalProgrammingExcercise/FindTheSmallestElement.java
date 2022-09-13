package FunctionalProgrammingExcercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> minElementIndex = integerList -> {
            int minElement = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) < minElement) {
                    minElement = integerList.get(i);
                    index = i;
                }
            }
            return index;
        };
        System.out.println(minElementIndex.apply(list));
    }
}
