package FunctionalProgramming;

import javax.swing.plaf.FontUIResource;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        Function<List<Integer>, String> countFormatter = list -> "Count = " + list.size();

        Function<List<Integer>, Integer> sumAllNumbers = list -> list.stream().mapToInt(e -> e).sum();
        Function<Integer, String> formatSum = sum -> "Sum = " + sum;

        String output = countFormatter.apply(numbers);
        Integer sum = sumAllNumbers.apply(numbers);
        String outputSum = formatSum.apply(sum);

        System.out.println(output);
        System.out.println(outputSum);

        // other way
        // reduce - част от stream API, който ми позволява поток от ел. да го редуцирам до една крайна стойност
     //   Function<List<Integer>, Integer> other = list -> list.stream().reduce(0, (fist, second) -> fist + second);


    }
}
