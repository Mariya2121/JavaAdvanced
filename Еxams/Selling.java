package Еxams;

import java.util.Scanner;

public class Selling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        int positionRow = 0;
        int positionCol = 0;
        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine();
            char[] arr = line.toCharArray();
            for (int col = 0; col < arr.length; col++) {
                matrix[row][col] = arr[col];
                if (matrix[row][col] == 'S') {
                    positionRow = row;
                    positionCol = col;
                }
            }
        }

        String command = scanner.nextLine();
        int money = 0;
        boolean isOut = false;

        while (true) {
            matrix[positionRow][positionCol] = '-';
            if (command.equals("up")) {
                if (positionRow == 0) {
                    isOut = true;
                }
                positionRow--;
            } else if (command.equals("down")) {
                if (positionRow == size - 1) {
                    isOut = true;
                }
                positionRow++;
            } else if (command.equals("right")) {
                if (positionCol == size - 1) {
                    isOut = true;
                }
                positionCol++;
            } else if (command.equals("left")) {
                if (positionCol == 0) {
                    isOut = true;
                }
                positionCol--;
            }
            if (isOut) {
                System.out.println("Bad news, you are out of the bakery.");
                break;
            }
            char symbol = matrix[positionRow][positionCol];
            boolean isDigit = Character.isDigit(symbol);

            if (isDigit) {
                money += Character.getNumericValue(symbol);
                if (money >= 50) {
                    System.out.println("Good news! You succeeded in collecting enough money!");
                    matrix[positionRow][positionCol] = 'S';
                    break;
                }
            } else if (symbol == 'O') {
                matrix[positionRow][positionCol] = '-';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (matrix[row][col] == 'O') {
                            positionRow = row;
                            positionCol = col;
                            matrix[positionRow][positionCol] = 'S';
                            break;
                        }
                    }
                }
            }
            matrix[positionRow][positionCol] = 'S';
            command = scanner.nextLine();
        }
        System.out.println("Money: " + money);

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
