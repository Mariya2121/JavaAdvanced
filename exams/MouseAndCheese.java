package exams;

import java.util.Scanner;

public class MouseAndCheese {
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
                if (matrix[row][col] == 'M') {
                    positionRow = row;
                    positionCol = col;
                }
            }
        }

        String command = scanner.nextLine();
        int countCheese = 0;

        while (!command.equals("end")) {
            matrix[positionRow][positionCol] = '-';
            if (command.equals("up")) {
                if (positionRow == 0) {
                    getOut();
                    break;
                }
                positionRow--;
                if (matrix[positionRow][positionCol] == 'B') {
                    matrix[positionRow][positionCol] = '-';
                    positionRow--;
                }
            } else if (command.equals("down")) {
                if (positionRow == size - 1) {
                    getOut();
                    break;
                }
                positionRow++;
                if (matrix[positionRow][positionCol] == 'B') {
                    matrix[positionRow][positionCol] = '-';
                    positionRow++;
                }
            } else if (command.equals("right")) {
                if (positionCol == size - 1) {
                    getOut();
                    break;
                }
                positionCol++;
                if (matrix[positionRow][positionCol] == 'B') {
                    matrix[positionRow][positionCol] = '-';
                    positionCol++;
                }
            } else if (command.equals("left")) {
                if (positionCol == 0) {
                    getOut();
                    break;
                }
                positionCol--;
                if (matrix[positionRow][positionCol] == 'B') {
                    matrix[positionRow][positionCol] = '-';
                    positionCol--;
                }
            }
            if (matrix[positionRow][positionCol] == 'c') {
                countCheese++;
            }
            matrix[positionRow][positionCol] = 'M';
            command = scanner.nextLine();
        }

        if (countCheese >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", countCheese);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - countCheese);
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static void getOut() {
        System.out.println("Where is the mouse?");
    }
}
