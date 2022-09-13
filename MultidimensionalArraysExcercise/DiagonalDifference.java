package MultidimensionalArraysExcercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int sumPrimary = 0;

        for (int row = 0; row < n; row++) {
                sumPrimary += matrix[row][row];
        }

        int sumSecondary = 0;
        for (int row = 0; row < n; row++) {
                sumSecondary += matrix[row][n - 1 - row];
        }

        System.out.println(Math.abs(sumPrimary - sumSecondary));
    }
}
