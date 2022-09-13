package StackAndQueuesExcercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String[] line = scanner.nextLine().split("\\s+");
//
//        int n = Integer.parseInt(line[0]);
//        int s = Integer.parseInt(line[1]);
//        int x = Integer.parseInt(line[2]);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        }
        else {
            if (stack.contains(x)) {
                System.out.println("true");
            }
            else {
               // System.out.println(Collections.min(stack));
               // System.out.println(stack.stream().min(Integer::compare).get());
                System.out.println(stack.stream().mapToInt(e -> e).min().getAsInt());
            }
        }
    }
}
