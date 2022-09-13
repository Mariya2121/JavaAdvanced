package FunctionalProgrammingExcercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) {
         Scanner scanner =  new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

         int[] numbersToDivide = Arrays.stream(scanner.nextLine().split("\\s+"))
                 .mapToInt(Integer::parseInt).toArray();

        Predicate<Integer> isDivisible = number -> {
            for (int numToDivide : numbersToDivide) {
                if (number % numToDivide != 0){
                    return false;
                }
            }
            return true;
        };

        Consumer<Integer> print = num -> System.out.print(num + " ");
        for (int i = 1; i <= n; i++) {
            if (isDivisible.test(i)){
                print.accept(i);
            }
        }
    }
}
