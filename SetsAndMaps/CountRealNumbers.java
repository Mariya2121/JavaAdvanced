package SetsAndMaps;

import java.security.Key;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> map = new LinkedHashMap<>();

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        for (Double num : numbers) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Double key : map.keySet()) {
            System.out.printf("%.1f -> %d%n", key, map.get(key));
        }

        // Other option !!!

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .forEach(key -> {
                    if (map.containsKey(key)) {
                        int oldCount = map.get(key);
                        map.put(key, oldCount + 1);
                    } else {
                        map.put(key, 1);
                    }
                });

        // Map.Entry<Double,Integer> = var
        for (var entry : map.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
