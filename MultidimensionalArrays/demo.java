package MultidimensionalArrays;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {10, 11, 12},
                {14, 16, 17},
                {3, 3, 5}
        };

        // fill the matrix --> n + 1

        int[][] matrix2 = new int[3][4];
        int start = 1;

       // for (int row = 0; row < 3; row++) {
//            int[] arr = new int[4];
//
//            for (int col = 0; col < arr.length; col++) {
//                arr[col] = start;
//                start++;
//            }
//            matrix2[row] = arr;
//        }
      //  System.out.println();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                matrix2[row][col] = start;
                start++;
            }
        }
        System.out.println();
    }

}
