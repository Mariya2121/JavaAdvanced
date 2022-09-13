package TuppleExGenerics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String firstName = input[0];
        String secondName = input[1];
        String address = input[2];
        Tuple<String, String> tuple = new Tuple<>(firstName + " " + secondName, address);
        System.out.println(tuple);

        input = scanner.nextLine().split("\\s+");
        String firstName2 = input[0];
        int beers = Integer.parseInt(input[1]);
        Tuple<String, Integer> tuple2 = new Tuple<>(firstName2, beers);
        System.out.println(tuple2);

        input = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(input[0]);
        double num2 = Double.parseDouble(input[1]);
        Tuple<Integer, Double> tuple3 = new Tuple<>(num, num2);
        System.out.println(tuple3);

    }
}
