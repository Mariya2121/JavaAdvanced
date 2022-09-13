package StackAndQueuesExcercise;

import java.util.ArrayDeque;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parentheses = scanner.nextLine();

        ArrayDeque<Character> openingStack = new ArrayDeque<>();
        ArrayDeque<Character> closedQueue = new ArrayDeque<>();

        for (int i = 0; i < parentheses.length(); i++) {
            char symbol = parentheses.charAt(i);
            if (symbol == '(' || symbol == '[' || symbol == '{'){
                openingStack.push(symbol);
            }
            else {
                closedQueue.offer(symbol);
            }
        }

        while (true){
            if (openingStack.isEmpty() || closedQueue.isEmpty()){
                System.out.println("NO");
                break;
            }
            if (openingStack.peek() == '(' && closedQueue.peek() == ')'){
                openingStack.pop();
                closedQueue.poll();
            }
            else if (openingStack.peek() == '{' && closedQueue.peek() == '}'){
                openingStack.pop();
                closedQueue.poll();
            }
            else if (openingStack.peek() == '[' && closedQueue.peek() == ']'){
                openingStack.pop();
                closedQueue.poll();
            }
            else {
                System.out.println("NO");
                break;
            }
            if (openingStack.isEmpty() &&  closedQueue.isEmpty()){
                System.out.println("YES");
                break;
            }
        }
    }
}
