package SetsAndMapsExcercise;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            set.addAll(List.of(data));
        }

//        for (String s : set) {
//            System.out.print(s + " ");
//        }

        System.out.println(String.join(" ",set));
    }
}
