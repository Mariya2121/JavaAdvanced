package Еxams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        int positionRow = 0;
        int positionCol = 0;

        String[] commands = scanner.nextLine().split(",");
        for (int row = 0; row < n; row++) {
            List<Character> characterList = Arrays.stream(scanner.nextLine().split(" "))
                    .map(e -> e.charAt(0)).collect(Collectors.toList());
            for (int col = 0; col < characterList.size(); col++) {
                matrix[row][col] = characterList.get(col);
                if (matrix[row][col] == 'D') {
                    positionRow = row;
                    positionCol = col;
                }

            }
        }
        int totalSum = 0;
        boolean isCaught = false;

        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            if (command.equals("up")) {
                if (positionRow == 0) {
                    System.out.println("You cannot leave the town, there is police outside!");
                    matrix[positionRow][positionCol] = '+';
                    continue;
                } else {
                    matrix[positionRow][positionCol] = '+';
                    positionRow--;
                }


            } else if (command.equals("down")) {
                if (positionRow == n - 1) {
                    System.out.println("You cannot leave the town, there is police outside!");
                    matrix[positionRow][positionCol] = '+';
                    continue;
                } else {
                    matrix[positionRow][positionCol] = '+';
                    positionRow++;
                }
            } else if (command.equals("left")) {

                if (positionCol == 0) {
                    System.out.println("You cannot leave the town, there is police outside!");
                    matrix[positionRow][positionCol] = '+';
                    continue;
                } else {
                    matrix[positionRow][positionCol] = '+';
                    positionCol--;
                }


            } else if (command.equals("right")) {
                if (positionCol == n - 1) {
                    System.out.println("You cannot leave the town, there is police outside!");
                    matrix[positionRow][positionCol] = '+';
                    continue;
                } else {
                    matrix[positionRow][positionCol] = '+';
                    positionCol++;
                }

            }

            if (matrix[positionRow][positionCol] == '$') {
                matrix[positionRow][positionCol] = '+';
                int currentSum = positionRow * positionCol;
                totalSum += currentSum;
                System.out.printf("You successfully stole %d$.%n", currentSum);
            } else if (matrix[positionRow][positionCol] == 'P') {
                matrix[positionRow][positionCol] = '#';
                isCaught = true;
                break;
            }

            matrix[positionRow][positionCol] = 'D';
        }
        if (isCaught) {
            System.out.printf("You got caught with %d$, and you are going to jail.%n", totalSum);
        } else {
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalSum);
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
