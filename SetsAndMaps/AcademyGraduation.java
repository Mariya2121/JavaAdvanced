package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double averageGrade = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).average().getAsDouble();
            map.put(name, averageGrade);
        }

        map.forEach((key, value) -> {
            System.out.printf("%s is graduated with %f%n", key, value);
        });

    }
}
