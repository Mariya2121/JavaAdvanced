
package SetsAndMapsExcercise;

import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, Integer> materials = new TreeMap<>();

        while (scanner.hasNextLine()) {
            String[] data = input.split("\\s+");
            for (int i = 0; i < data.length; i++) {
                int quantity = Integer.parseInt(data[i]);
                String item = data[i + 1].toLowerCase();

                if (materials.containsKey(item)){
                    int oldQuantity = materials.get(item);
                    materials.put(item, oldQuantity + quantity);
                }
                else {
                    materials.put(item, quantity);
                }

            }


            input = scanner.nextLine();
        }

    }
}
