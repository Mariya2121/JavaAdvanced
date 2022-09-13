package SetsAndMaps;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashSet<String> parking = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] command = input.split(", ");
            if (command[0].equals("IN")) {
                parking.add(command[1]);
            } else {
                parking.remove(command[1]);
            }
            input = scanner.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : parking) {
                System.out.println(s);
            }

            // System.out.println(String.join(System.lineSeparator(),parking));
        }
    }
}
