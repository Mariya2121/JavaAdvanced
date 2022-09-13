package SetsAndMapsExcercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> phonebook = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")) {
            String[] data = input.split("-");
            String name = data[0];
            String phone = data[1];

            if (phonebook.containsKey(name)) {
                phonebook.replace(name, phonebook.get(name), phone);
            } else {
                phonebook.put(name, phone);
            }
            input = scanner.nextLine();
        }
         input = scanner.nextLine();

        while (!input.equals("stop")){
            if (phonebook.containsKey(input)){
                System.out.printf("%s -> %s%n",input, phonebook.get(input));
            }
            else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scanner.nextLine();
        }

    }
}
