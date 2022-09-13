package SetsAndMapsExcercise;

import java.lang.invoke.SwitchPoint;
import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, HashSet<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] data = input.split(": ");
            String name = data[0];
            String[] cards = data[1].split(", ");

            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>());
            }
            int sum = 0;

            for (String card : cards) {
                players.get(name).add(card);
            }

            input = scanner.nextLine();
        }
        for (var entry : players.entrySet()) {
            String name = entry.getKey();
            int points = calculatePoints(entry.getValue());
            System.out.printf("%s: %d%n", name, points);
        }
    }

    private static int calculatePoints(HashSet<String> cards) {
        int points = 0;
        for (String card : cards) {
            String power = card.substring(0,card.length() - 1);
            char type = card.charAt(card.length() - 1);
            points += getPower(power) * getType(type);
        }
        return points;
    }

    private static int getPower(String power) {
        int powerPoints = 0;
        int typePoints = 0;
        switch (power) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(power);

        }

    }

    private static int getType(char type) {
        switch (type) {
            case 'S':
                return 4;
            case 'H':
                return 3;
            case 'D':
                return 2;
            case 'C':
                return 1;

            default:
                return 0;
        }
    }
}
