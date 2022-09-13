package SetsAndMapsExcercise;

import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> set = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();
            set.add(username);
        }
        for (String s : set) {
            System.out.println(s);
        }
      //  set.forEach(System.out::println);
    }
}
