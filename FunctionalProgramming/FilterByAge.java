package FunctionalProgramming;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class FilterByAge {

    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person p = new Person(name, age);
            people.add(p);
        }


        String ageCondition = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());
        String outputCondition = scanner.nextLine();

        people = filterByAgeCondition(people, getPredicate(ageCondition, ageFilter));

        Consumer<Person> printer = getPrinter(outputCondition);
        people.forEach(printer);
    }

    private static Consumer<Person> getPrinter(String outputCondition) {

        switch (outputCondition) {
            case "name":
                return p -> System.out.println(p.name);
            case "age":
                return p -> System.out.println(p.age);
            case "name age":
                return p -> System.out.println(p.name + " - " + p.age);
            default:
                throw new IllegalArgumentException("Unknown format" + outputCondition);
        }
    }

    private static Predicate<Person> getPredicate(String ageCondition, int ageFilter) {

        switch (ageCondition) {
            case "younger":
                return p -> p.age <= ageFilter;
            case "older":
                return p -> p.age >= ageFilter;
            default:
                throw new IllegalArgumentException("Invalid parameters" + ageCondition + " " + ageFilter);
        }
    }

    private static List<Person> filterByAgeCondition(List<Person> people, Predicate<Person> predicate) {
        return people.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
