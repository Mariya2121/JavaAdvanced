package CustomListExGenerics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        CustomList<String> customList = new CustomList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");

            switch (data[0]) {
                case "Add":
                    customList.add(data[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(data[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(data[1]));
                    break;
                case "Greater":
                    System.out.println(customList.countOfGreaterElements(data[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    break;
                case "Max":
                    System.out.println(customList.max());
                    break;
                case "Min":
                    System.out.println(customList.min());
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
