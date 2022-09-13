package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] liliesInput = scanner.nextLine().split(", ");
        String[] rosesInput = scanner.nextLine().split(", ");

        List<Integer> lilies = Arrays.stream(liliesInput).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> roses = Arrays.stream((rosesInput)).map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();
        for (Integer lily : lilies) {
            liliesStack.push(lily);
        }
        ArrayDeque<Integer> rosesQueue = new ArrayDeque<>();
        for (Integer rose : roses) {
            rosesQueue.offer(rose);
        }

        int countWreath = 0;
        int otherFlowers = 0;

        while (!lilies.isEmpty() && !rosesQueue.isEmpty()) {
            int rose = rosesQueue.poll();
            int lily = liliesStack.pop();

            int sum = rose + lily;

            while (sum > 15) {
                lily -= 2;
                sum = lily + rose;
            }

            if (sum == 15) {
                countWreath++;
            } else if (sum < 15) {
                otherFlowers += sum;
            }
        }

        int leftOverWreaths = otherFlowers / 15;
        countWreath += leftOverWreaths;

        if (countWreath >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", countWreath);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - countWreath);
        }
    }
}
