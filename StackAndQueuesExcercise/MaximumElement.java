package StackAndQueuesExcercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int command = scanner.nextInt();
            if (command == 1) {
                int numberToAdd = scanner.nextInt();
                stack.push(numberToAdd);
            } else if (command == 2) {
                stack.pop();
            } else {
                System.out.println(Collections.max(stack));
            }
        }
    }
}
