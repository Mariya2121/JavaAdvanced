package exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        int totalFood = 0;
        int positionRow = 0;
        int positionCol = 0;

        String[] commands = scanner.nextLine().split(", ");
        for (int row = 0; row < n; row++) {
            List<Character> characterList = Arrays.stream(scanner.nextLine().split(" "))
                    .map(e -> e.charAt(0)).collect(Collectors.toList());
            for (int col = 0; col < characterList.size(); col++) {
                matrix[row][col] = characterList.get(col);
                if (matrix[row][col] == 's') {
                    positionRow = row;
                    positionCol = col;
                }
                if (matrix[row][col] == 'f') {
                    totalFood++;
                }
            }
        }

        int length = 1;

        boolean isStrength = false;
        boolean isDead = false;

        for (int i = 0; i < commands.length; i++) {
            matrix[positionRow][positionCol] = '*';
            if (commands[i].equals("up")) {
                positionRow--;
                if (matrix[positionRow][positionCol] == 'f') {
                    length++;
                    matrix[positionRow][positionCol] = '*';
                } else if (matrix[positionRow][positionCol] == 'e') {
                    isDead = true;
                    break;
                }
                if (positionRow == 0) {
                    positionRow = n - 1;
                }
            } else if (commands[i].equals("down")) {
                positionRow++;
                if (matrix[positionRow][positionCol] == 'f') {
                    length++;
                    matrix[positionRow][positionCol] = '*';
                } else if (matrix[positionRow][positionCol] == 'e') {
                    isDead = true;
                    break;
                }
                if (positionRow == n - 1) {
                    positionRow = 0;
                }
            } else if (commands[i].equals("right")) {
                positionCol++;
                if (matrix[positionRow][positionCol] == 'f') {
                    length++;
                    matrix[positionRow][positionCol] = '*';
                } else if (matrix[positionRow][positionCol] == 'e') {
                    isDead = true;
                    break;
                }
                if (positionCol == n - 1) {
                    positionCol = 0;
                }
            } else if (commands[i].equals("left")) {
                positionCol--;
                if (matrix[positionRow][positionCol] == 'f') {
                    length++;
                    matrix[positionRow][positionCol] = '*';
                } else if (matrix[positionRow][positionCol] == 'e') {
                    isDead = true;
                    break;
                }
                if (positionCol == 0) {
                    positionCol = n - 1;
                }
            }
            if (length == totalFood + 1) {
                isStrength = true;
                break;
            }
            if (matrix[positionRow][positionCol] == 'f') {
                length++;
                matrix[positionRow][positionCol] = '*';
            } else if (matrix[positionRow][positionCol] == 'e') {

                break;
            }
            matrix[positionRow][positionCol] = 's';
        }

        if (isStrength) {
            System.out.printf("You win! Final python length is %d", length);
        } else if (isDead) {
            System.out.println("You lose! Killed by an enemy!");
        } else {
            System.out.printf("You lose! There is still %d food to be eaten.", totalFood - length);
        }

    }
}
