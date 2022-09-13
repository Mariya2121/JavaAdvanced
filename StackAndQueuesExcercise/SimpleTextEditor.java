package StackAndQueuesExcercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");

            switch (Integer.parseInt(line[0])) {
                case 1:
                    stringBuilder.append(line[1]);
                    stack.push(stringBuilder.toString());
                    break;
                case 2:
                    int startToDelete = stringBuilder.length() - Integer.parseInt(line[1]);
                    stringBuilder.delete(startToDelete, stringBuilder.length() - 1);
                    stack.push(stringBuilder.toString());
                    break;
                case 3:
                    System.out.println(stringBuilder.charAt(Integer.parseInt(line[1])));
                case 4:
                    stack.pop();
                    break;

            }
        }

    }
}
