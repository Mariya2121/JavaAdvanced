package SetsAndMapsExcercise;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        Set<Integer> firstNumbers = new LinkedHashSet<>();
        Set<Integer> secondNumbers = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            firstNumbers.add(num);
        }
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            secondNumbers.add(num);
        }

        firstNumbers.retainAll(secondNumbers); // приема колекция и оставя в подадената колекция елементите които съвпадат

        for (Integer firstNumber : firstNumbers) {
            System.out.print(firstNumber + " ");
        }
    }
}
