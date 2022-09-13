package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();

        String currentUrl = "blank";

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (stack.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    currentUrl = stack.pop();
                }
            } else {
                if (!currentUrl.equals("blank")) {
                    stack.push(currentUrl);
                }
                currentUrl = input;

            }
            System.out.println(currentUrl);
            input = scanner.nextLine();
        }
    }
}
