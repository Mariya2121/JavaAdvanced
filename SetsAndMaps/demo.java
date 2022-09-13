package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hash function

        String first = "Hello from Java";
        String second = "The quick brown fox";
        String third = "jumps over the lazy dog";

        int first_hashcode = first.hashCode();
        int second_hashcode = second.hashCode();
        int third_hashcode = third.hashCode();

//        System.out.println(first_hashcode);
//        System.out.println(second_hashcode);
//        System.out.println(third_hashcode);


        //Колизия - two different strings with same hashcode

        // 3 ways to iterate a Map
        Map<Integer, String> map = new HashMap<>();

        //iterate keys
        Set<Integer> integers = map.keySet();

        // iterate keys and values

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        // Iterate valus - Dont use unless  needed. It`s too slowly

        Collection<String> values = map.values();


        //Find Largest 3 numbers

        System.out.println(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .map(String::valueOf).collect(Collectors.joining(" ")));

    }
}
