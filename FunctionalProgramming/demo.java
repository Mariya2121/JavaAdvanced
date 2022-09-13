package FunctionalProgramming;

import javax.sql.rowset.Predicate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read numbers arr[] from console on one line
        // read number  int power
        // raise and print all numbers from arr[] to pow

        int[] arr = {13, 42, 69, 73};
        int pow = 2;

        for (int number : arr) {
            System.out.println(getPowerOf(number, pow));
        }
        // Same as for
        Arrays.stream(arr).forEach(n -> System.out.println(getPowerOf(n, pow)));

        Arrays.stream(arr).mapToDouble(n -> getPowerOf(n, pow)).forEach(System.out::println);


        //Same as method
        Arrays.stream(arr).mapToDouble((n) -> {
                    return Math.pow(n, pow);
                })
                .forEach(System.out::println);

        Arrays.stream(arr).mapToDouble(n  -> n * n)
                .forEach(System.out::println);

        new Thread(() -> System.out.println("Hello")).run();


        //Special functions

        // Consumer - функ. интерфейс, който ни позволява да подадем елемент, но да не получим изход (прилича на void method)
        //приема вход, но не връща изход. Извиква се с accept()

        Consumer<String> print = message -> System.out.println(message);
        print.accept("Peter");

        // Supplier - не приема вход, няма аргументи, но връща стойност. Дава ни нещо на готово
        // иьползваме с .get()

        Supplier<Integer> getRandomInt = () -> new Random().nextInt(51);

        int rnd = getRandomInt.get();

        //Predicate - приема стойност и връща boolean(true or false). Извиква се с .test
     //   Predicate<Integer> isEven = number -> number % 2 == 0;

        //System.out.println(isEven.test(6)); // true


        //Bi Functions - два входни параметъра и един за изход

        BiFunction<Integer, Integer, String> sum = (x, y) -> "Sum is" + (x + y);
//        BiConsumer <T, U>
//        BiPredicate <T, U>

        // полиморфизъм - когато на метод подаваме функция


        // приема един тип данни, който е и типа на връщане;; каквото приемаме, това връщаме
        UnaryOperator<String> unaryOperator = s -> s + "Bravo";




        int a = 5;
        int b = operation(a, number -> number * 5);

    }

    static int operation(int number, Function<Integer, Integer> function) {
        return function.apply(number);
    }

    // method:
    // return type -> double
    // name -> getPowerOf
    // parameters list -> getPowerOf(int x, int pow)\
    // signature -> etPowerOf(int, int) - не се интересува от имената на параментрите
    // body -> { return Math.pow(x, pow);}

    public static double getPowerOf(int x, int pow) {
        return Math.pow(x, pow);
    }
}
