package Еxams;

import java.util.*;

public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] milkData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        ArrayDeque<Double> milk = new ArrayDeque<>();
        for (double ingredientsDatum : milkData) {
            milk.offer(ingredientsDatum);
        }

        double[] powderData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        ArrayDeque<Double> powder = new ArrayDeque<>();
        for (double freshnessDatum : powderData) {
            powder.push(freshnessDatum);
        }

        Map<String, Integer> chocolates = new TreeMap<>();
        chocolates.put("Milk Chocolate", 0);
        chocolates.put("Dark Chocolate", 0);
        chocolates.put("Baking Chocolate", 0);


        while (!milk.isEmpty() && !powder.isEmpty()) {
            double currentMilk = milk.poll();
            double currentPowder = powder.pop();

            int sum = (int) ((currentPowder / (currentMilk + currentPowder)) * 100);

            if (sum == 30) {
                chocolates.put("Milk Chocolate", chocolates.get("Milk Chocolate") + 1);
            } else if (sum == 50) {
                chocolates.put("Dark Chocolate", chocolates.get("Dark Chocolate") + 1);
            } else if (sum == 100) {
                chocolates.put("Baking Chocolate", chocolates.get("Baking Chocolate") + 1);
            } else {
                currentMilk += 10;
                milk.offer(currentMilk);
            }
        }

        boolean isPrepared = chocolates.values().stream().allMatch(chocolate -> chocolate > 0);
        if (isPrepared) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        chocolates.entrySet().stream().filter(e -> e.getValue() > 0)
                .forEach(e -> System.out.printf("# %s --> %d%n", e.getKey(), e.getValue()));
    }
}
