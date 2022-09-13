package MultidimensionalArraysExcercise;

import java.util.Scanner;

public class MatrixOfPolindromes {
    public static void main(String[] args) {
         Scanner scanner =  new Scanner(System.in);

         int rows = scanner.nextInt();
         int cols = scanner.nextInt();


         String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char outside = (char) ('a' + row);
                char middle = (char) (outside + col);
                matrix[row][col] = String.valueOf(outside) + middle + outside;
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
