package FunctionalProgrammingExcercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        // Predicate<String>

        while (!input.equals("Party!")) {
            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            Predicate<String> predicate = getPredicate(commandParts);
            switch (command) {
                case "Double":
                    List<String> peopleToAddAgain = new ArrayList<>();
                    names.stream().filter(predicate).forEach(person -> peopleToAddAgain.add(person));
                    names.addAll(peopleToAddAgain);
                    break;
                case "Remove":
                    names.removeIf(predicate);
                    break;
            }

            input = scanner.nextLine();
        }

        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(names);
            String result = String.join(", ", names) + " are going to the party!";
            System.out.println(result);
        }
    }

    public static Predicate<String> getPredicate(String[] commandParts) {
        Predicate<String> predicate = null;
        String filterName = commandParts[1];
        String filterCriteria = commandParts[2];

        switch (filterName) {
            case "StartsWith":
                predicate = name -> name.startsWith(filterCriteria);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(filterCriteria);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(filterCriteria);
                break;
        }
        return predicate;
    }
}
