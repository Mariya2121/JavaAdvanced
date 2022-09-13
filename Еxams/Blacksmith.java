package Еxams;

import java.util.*;
import java.util.stream.Collectors;


public class Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] steelData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> steelQueue = new ArrayDeque<>();
        for (int i = 0; i < steelData.length; i++) {
            steelQueue.offer(steelData[i]);
        }

        int[] carbonData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> carbonStack = new ArrayDeque<>();
        for (int i = 0; i < steelData.length; i++) {
            carbonStack.push(carbonData[i]);
        }

        TreeMap<String, Integer> swords = new TreeMap<>();
        swords.put("Gladius", 0);
        swords.put("Shamshir", 0);
        swords.put("Katana", 0);
        swords.put("Sabre", 0);


        while (!steelQueue.isEmpty() && !carbonStack.isEmpty()) {
            int sum = steelQueue.peek() + carbonStack.peek();

            if (sum == 70) {
                steelQueue.poll();
                carbonStack.pop();
                swords.put("Gladius", swords.get("Gladius") + 1);

            } else if (sum == 80) {
                steelQueue.poll();
                carbonStack.pop();
                swords.put("Shamshir", swords.get("Shamshir") + 1);
            } else if (sum == 90) {
                steelQueue.poll();
                carbonStack.pop();
                swords.put("Katana", swords.get("Katana") + 1);

            } else if (sum == 110) {
                steelQueue.poll();
                carbonStack.pop();
                swords.put("Sabre", swords.get("Sabre") + 1);
            } else {
                steelQueue.poll();
                int increase = carbonStack.pop();
                carbonStack.push(increase + 5);
            }

        }
        int swordsSum = swords.values().stream().mapToInt(element -> element).sum();

        if (swordsSum == 0) {
            System.out.println("You did not have enough resources to forge a sword.");

        } else {
            System.out.printf("You have forged %d swords.%n", swordsSum);
        }

        if (steelQueue.isEmpty()) {
            System.out.println("Steel left: none");
        } else {
            String collect = steelQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Steel left:" + collect);

           // System.out.print(steel.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
        if (carbonStack.isEmpty()) {
            System.out.printf("%nCarbon left: none");
        } else {
            String collect = carbonStack.stream().map(String::valueOf).collect(Collectors.joining(", "));

            System.out.println("Carbon left: " + collect);
        }
        swords.entrySet().stream()
                .filter(entry -> entry.getValue() > 0).forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }
}
