package MultidimensionalArraysExcercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }

        String data = scanner.nextLine();

        while (!data.equals("END")) {
            String[] commands = data.split("\\s+");


            String swap = commands[0];

            if (!swap.equals("swap") && commands.length != 5){
                System.out.println("Invalid input!");
                data = scanner.nextLine();
                continue;
            }

            int firstRow = Integer.parseInt(commands[1]);
            int firstCol = Integer.parseInt(commands[2]);
            int secondRow = Integer.parseInt(commands[3]);
            int secondCol = Integer.parseInt(commands[4]);

            if (firstRow <= rows - 1 && firstCol <= cols - 1 && secondCol <= cols - 1 && secondRow <= rows - 1) {

                String current = matrix[firstRow][firstCol];
                matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
                matrix[secondRow][secondCol] = current;

                printMatrix(rows, cols, matrix);
            } else {
                System.out.println("Invalid input!");
            }
            data = scanner.nextLine();
        }
    }

    private static void printMatrix(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
