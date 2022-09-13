package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> patato = new ArrayDeque<>();

        for (String name : names) {
            patato.offer(name);
        }

        while (patato.size() != 1) {
            for (int i = 0; i < n; i++) {

            }
        }


    }
}
