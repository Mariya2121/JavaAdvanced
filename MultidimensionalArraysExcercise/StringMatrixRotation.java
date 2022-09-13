package MultidimensionalArraysExcercise;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();

        String input = scanner.nextLine();

        List<String> words = new ArrayList<>();
        int maxColumnLen = Integer.MIN_VALUE;

        while (!input.equals("END")) {
            words.add(input);
            int currentLen = input.length();
            if (currentLen > maxColumnLen) {
                maxColumnLen = currentLen;
            }
            input = scanner.nextLine();
        }
        int rows = words.size();
        int cols = maxColumnLen;
        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String currWord = words.get(row);
            for (int col = 0; col < cols; col++) {
                if (col < currWord.length()) {
                    char currantChar = currWord.charAt(col);
                    matrix[row][col] = currantChar;
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
        String angleString = rotation.split("[()]")[1];
        int angle = Integer.parseInt(angleString);
        int angleRotation = angle % 360;
        printMatrix(matrix, rows, cols, angleRotation);

    }

    // left - right -> col ++
    // right - left -> coll --
    // up -> row --
    // down -> row ++
    private static void printMatrix(char[][] matrix, int rows, int cols, int angleRotation) {
        switch (angleRotation) {
            case 0:
                //dont rotate
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;

            case 270:
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
