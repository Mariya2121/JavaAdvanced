package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int[] positions = Arrays.stream(scanner.nextLine().split(".\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int row = positions[0];
        int col = positions[1];

        int numberToChange = matrix[row][col];

        int cols = matrix[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == numberToChange) {
                    int sum = 0;
                    if (cols - 1 > c) {
                        sum += matrix[row][col];
                    }
                }

            }
        }
    }
}