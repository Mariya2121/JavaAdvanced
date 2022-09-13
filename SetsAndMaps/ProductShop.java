package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Double>> map = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] data = input.split(", ");
            String shop = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);

            map.putIfAbsent(shop, new LinkedHashMap<>());
            map.get(shop).put(product, price);

            input = scanner.nextLine();
        }

        map.forEach((key1, value1) -> {
            System.out.println(key1 + "->");

            value1.forEach((key, value) -> {
                System.out.println("Product: " + key + ", Price: " + value);
            });
        });
    }
}
