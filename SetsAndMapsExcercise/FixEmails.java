package SetsAndMapsExcercise;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("stop"))break;

            String email = scanner.nextLine();
            int index = email.lastIndexOf(".");
            String substring = email.substring(index + 1, email.length());

            if (!substring.equals("us") && !substring.equals("uk") && !substring.equals("com")){
                emails.put(name, email);
            }
        }
        emails.forEach((key,value) -> System.out.println(key + " -> " + value));
    }
}
