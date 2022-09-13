package GenericsExcercise;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //    Зад 1 Generic Box
//        int n = Integer.parseInt(scanner.nextLine());
//
//        Box<String> box = new Box<>();
//        for (int i = 0; i < n; i++) {
//            String element = scanner.nextLine();
//            box.add(element);
//        }
//        System.out.println(box.toString());


        //Problem 2.	Generic Box of Integer

//        int count = Integer.parseInt(scanner.nextLine());
//
//        Box2 box2 = new Box2();
//
//        for (int i = 0; i < count; i++) {
//            int number = Integer.parseInt(scanner.nextLine());
//            box2.add(number);
//        }
//        System.out.println(box2.toString());


        //Problem 3.	Generic Swap Method Strings and Integers

//        int n = Integer.parseInt(scanner.nextLine());
//
//        Swap<Integer> swap = new Swap<>();
//        for (int i = 0; i < n; i++) {
//            int element = Integer.parseInt(scanner.nextLine());
//            swap.add(element);
//        }
//        int[] indices = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        int index1 = indices[0];
//        int index2 = indices[1];
//        swap.swapElements(index1, index2);
//
//        System.out.println(swap.toString());


        //Problem 5.	Generic Count Method Strings
//        int count = Integer.parseInt(scanner.nextLine());
//        Box<String> box = new Box<>();
//
//        for (int i = 0; i < count; i++) {
//            String input = scanner.nextLine();
//            box.add(input);
//        }
//
//        String element = scanner.nextLine();
//
//        System.out.println(box.countOfGreaterElements(element));

        //Problem 6.	Generic Count Method Doubles
        int n = Integer.parseInt(scanner.nextLine());

        Box<Double> box2 = new Box<>();

        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            box2.add(num);
        }
        Double elementToCompare = Double.parseDouble(scanner.nextLine());
        System.out.println(box2.countOfGreaterElements(elementToCompare));


    }
}
