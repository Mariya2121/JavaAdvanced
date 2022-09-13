package exams;

import java.util.*;

public class FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vowels = scanner.nextLine().split(" ");
        ArrayDeque<String> vowelsQueue = new ArrayDeque<>();
        Collections.addAll(vowelsQueue, vowels);

        String[] consonants = scanner.nextLine().split(" ");
        ArrayDeque<String> consonantStack = new ArrayDeque<>();
        Arrays.stream(consonants).forEach(consonantStack::push);

        Set<String> pear = new HashSet<>();
        Set<String> flour = new HashSet<>();
        Set<String> pork = new HashSet<>();
        Set<String> olive = new HashSet<>();
        List<String> foundWord = new ArrayList<>();

        while (!consonantStack.isEmpty()) {
            String vowel = vowelsQueue.poll();
            String consonant = consonantStack.pop();

            if ("pear".contains(vowel)) {
                pear.add(vowel);
            }
            if ("pear".contains(consonant)) {
                pear.add(consonant);
            }
            if ("flour".contains(vowel)) {
                flour.add(vowel);
            }
            if ("flour".contains(consonant)) {
                flour.add(consonant);
            }
            if ("pork".contains(vowel)) {
                pork.add(vowel);
            }
            if ("pork".contains(consonant)) {
                pork.add(consonant);
            }
            if ("olive".contains(vowel)) {
                olive.add(vowel);
            }
            if ("olive".contains(consonant)) {
                olive.add(consonant);
            }
            vowelsQueue.offer(vowel);
        }

        if (pear.size() == 4) {
            foundWord.add("pear");
        }
        if (flour.size() == 5) {
            foundWord.add("flour");
        }
        if (pork.size() == 4) {
            foundWord.add("pork");
        }
        if (olive.size() == 5) {
            foundWord.add("olive");
        }

        System.out.printf("Words found: %d%n", foundWord.size());
        foundWord.forEach(System.out::println);


    }
}
