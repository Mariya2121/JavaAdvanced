package Еxams;

import java.util.Scanner;

public class Armory {
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
                if (matrix[row][col] == 'A') {
                    positionRow = row;
                    positionCol = col;
                }
            }
        }

        int sum = 0;

        while (true) {
            String command = scanner.nextLine();
            matrix[positionRow][positionCol] = '-';
            if (command.equals("up")) {
                if (positionRow == 0) {
                    out();
                    break;
                }
                positionRow--;
            } else if (command.equals("down")) {
                if (positionRow == size - 1) {
                    out();
                    break;
                }
                positionRow++;

            } else if (command.equals("right")) {
                if (positionCol == size - 1) {
                    out();
                    break;
                }
                positionCol++;
            } else if (command.equals("left")) {
                if (positionCol == 0) {
                    out();
                    break;
                }
                positionCol--;
            }

            char symbol = matrix[positionRow][positionCol];
            boolean isDigit = Character.isDigit(symbol);

            if (isDigit) {
                sum += Character.getNumericValue(symbol);
                if (sum >= 65) {
                    System.out.println("Very nice swords, I will come back for more!");
                    matrix[positionRow][positionCol] = 'A';
                    break;
                }
            } else if (symbol == 'M') {
                matrix[positionRow][positionCol] = '-';

                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (matrix[row][col] == 'M') {
                            positionRow = row;
                            positionCol = col;
                            break;
                        }
                    }
                }
            }
            matrix[positionRow][positionCol] = 'А';
        }
        System.out.printf("The king paid %d gold coins.%n", sum);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static void out() {
        System.out.println("I do not need more swords!");
    }
}
