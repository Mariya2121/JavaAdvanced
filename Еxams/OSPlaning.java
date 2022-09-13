package Еxams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OSPlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(tasks::push);

        ArrayDeque<Integer> threads = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        int valueToBeKilled = Integer.parseInt(scanner.nextLine());

        while (true) {
            int thread = threads.peek();
            int task = tasks.peek();

            if (thread >= task) {
                if (task == valueToBeKilled) {
                    System.out.printf("Thread with value %d killed task %d%n", thread, valueToBeKilled);
                    break;
                }
                tasks.pop();
            }else {
                if (task == valueToBeKilled) {
                    System.out.printf("Thread with value %d killed task %d%n", thread, valueToBeKilled);
                    break;
                }
            }
            threads.poll();

        }

        threads.forEach(t -> System.out.print(t + " "));
    }
}
