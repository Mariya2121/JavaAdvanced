package StackAndQueuesExcercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class FibonnaciWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n < 2) {
            System.out.println(1);
            return;
        }
        ArrayDeque<Long> fibonacciStack = new ArrayDeque<>();
        fibonacciStack.push(0L);
        fibonacciStack.push(1L);

        for (int i = 0; i < n; i++) {
            long num1 = fibonacciStack.pop();
            long num2 = fibonacciStack.pop();
            fibonacciStack.push(num1);
            fibonacciStack.push(num1 + num2);
        }
        System.out.println(fibonacciStack.peek());
    }
}
