package SetsAndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String continent = data[0];
            String country = data[1];
            String town = data[2];

            map.putIfAbsent(continent,new LinkedHashMap<>());
            map.get(continent).putIfAbsent(country,new ArrayList<>());
            map.get(continent).get(country).add(town);
        }

        map.entrySet().forEach(entry -> {
            String continent = entry.getKey();
            Map<String, List<String>> countryWithSities = entry.getValue();

            System.out.println(continent + ":");

            countryWithSities.entrySet().forEach(countryEntry ->{
                System.out.println("  " + countryEntry.getKey() + " -> " + String.join(", ",countryEntry.getValue()));
            });

        });

    }
}
