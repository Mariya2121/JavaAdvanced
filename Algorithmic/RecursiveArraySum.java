package Algorithmic;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

//        System.out.println(Arrays.stream(arr).sum());

        System.out.println(sumArr(arr, 0));

    }

    public static int sumArr(int[] arr, int index) {
        if (index == arr.length - 1){
            return arr[index];
        }
        return arr[index] + sumArr(arr, index + 1);
    }
}
