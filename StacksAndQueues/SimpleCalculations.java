package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, line);

        int sum = 0;

        while (stack.size() != 1) {
            int first_num = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int second_num = Integer.parseInt(stack.pop());
            if (operation.equals("+")) {
                sum = first_num + second_num;
            } else if (operation.equals("-")) {
                sum = first_num - second_num;
            }
            stack.push(String.valueOf(sum));
        }
        System.out.println(stack.peek());
    }
}
