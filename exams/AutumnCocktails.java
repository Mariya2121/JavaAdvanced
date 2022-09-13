package exams;

import java.util.*;

public class AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ingredientsData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> ingredientsQueue = new ArrayDeque<>();
        for (int i = 0; i < ingredientsData.length; i++) {
            ingredientsQueue.offer(ingredientsData[i]);
        }

        int[] freshnessData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> freshnessStack = new ArrayDeque<>();
        for (int i = 0; i < freshnessData.length; i++) {
            freshnessStack.push(freshnessData[i]);
        }

        Map<String, Integer> cocktails = new TreeMap<>();
        cocktails.put("Pear Sour", 0);
        cocktails.put("The Harvest", 0);
        cocktails.put("Apple Hinny", 0);
        cocktails.put("High Fashion", 0);

        while (!freshnessStack.isEmpty() && !ingredientsQueue.isEmpty()) {
            int ingredients = ingredientsQueue.poll();
            if (ingredients == 0) continue;
            int freshness = freshnessStack.pop();

            int sum = freshness * ingredients;

            switch (sum) {
                case 150:
                    cocktails.put("Pear Sour", cocktails.get("Pear Sour") + 1);
                    break;
                case 250:
                    cocktails.put("The Harvest", cocktails.get("The Harvest") + 1);
                    break;
                case 300:
                    cocktails.put("Apple Hinny", cocktails.get("Apple Hinny") + 1);
                    break;
                case 400:
                    cocktails.put("High Fashion", cocktails.get("High Fashion") + 1);
                    break;
                default:
                    ingredients += 5;
                    ingredientsQueue.offer(ingredients);
                    break;
            }
        }
        boolean isReady = cocktails.values().stream().allMatch(value -> value > 0);
        if (isReady) {
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }

        int leftIngredients = 0;
        if (!freshnessStack.isEmpty()) {
            for (Integer integer : freshnessStack) {
                leftIngredients += integer;
            }
            System.out.printf("Ingredients left: %d%n", leftIngredients);
        } else if (!ingredientsQueue.isEmpty()) {
            for (Integer integer : ingredientsQueue) {
                leftIngredients += integer;
            }
            System.out.printf("Ingredients left: %d%n", leftIngredients);
        }

        cocktails.entrySet().stream().filter(cocktail -> cocktail.getValue() > 0)
                .forEach(cocktail -> System.out.printf("# %s --> %d%n", cocktail.getKey(), cocktail.getValue()));

    }
}
