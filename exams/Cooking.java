package exams;

import javax.management.MBeanRegistration;
import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(ingredients::push);

        Map<String, Integer> foods = new TreeMap<>();
        foods.put("Bread", 0);
        foods.put("Cake", 0);
        foods.put("Pastry", 0);
        foods.put("Fruit Pie", 0);

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int liquidsPeek = liquids.poll();
            int ingredientsPeek = ingredients.pop();
            int sum = ingredientsPeek + liquidsPeek;
            switch (sum) {
                case 25:
                    foods.put("Bread", foods.get("Bread") + 1);
                    break;
                case 50:
                    foods.put("Cake", foods.get("Cake") + 1);
                    break;
                case 75:
                    foods.put("Pastry", foods.get("Pastry") + 1);
                    break;
                case 100:
                    foods.put("Fruit Pie", foods.get("Fruit Pie") + 1);
                    break;
                default:
                    ingredientsPeek += 3;
                    ingredients.push(ingredientsPeek);
            }
        }

        boolean areCookedAll = foods.entrySet().stream().allMatch(food -> food.getValue() > 0);
        if (areCookedAll){
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        }
        else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }
        String remainingLiquids = liquids.isEmpty() ? "none" : liquids.stream().map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Liquids left: " + remainingLiquids);


//        if (liquids.isEmpty()){
//            System.out.println("Liquids left: none");
//        }
//        else {
//            String collect = liquids.stream().map(String::valueOf).collect(Collectors.joining(", "));
//            System.out.println("Liquids left: " + collect);
//        }
        if (ingredients.isEmpty()){
            System.out.println("Ingredients left: none");
        }
        else {
            String collect = ingredients.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Ingredients left: " + collect);
        }


        foods.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}
