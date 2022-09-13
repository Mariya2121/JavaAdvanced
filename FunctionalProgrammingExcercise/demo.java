package FunctionalProgrammingExcercise;

import java.util.function.*;

public class demo {
    public static void main(String[] args) {

        Function<String, Integer> myFunc = s -> Integer.parseInt(s);
        Function<String, String> func = s -> s + "Bravo";

        // приема един тип и връща същия тип данни
        UnaryOperator<String> unaryOperator = s -> s + "Bravo";

        BinaryOperator<String> binaryOperator = (text1, text2) -> text1 + text2;

        // приема аргумент и връща boolean true or false
        Predicate<String> predicate = s -> s.equals("Ivan");


        // приема типът на връщане; не приема нищо за вход
        Supplier<String> sup = () -> "Мариа";


        // приема тип данни, но не връща нищо, Използва се за принтиране
        Consumer<String> consumer = s -> System.out.println(s);

        // приема 2 аргумента
        BiConsumer<String, Integer> biConsumer = (text, number) -> System.out.println(text + number);

        BiPredicate<String,Integer> biPredicate = (text, number) -> text.length() > number;

      //  BiSupplier X няма такова нещо

        BiFunction<String, Integer, Integer> biFunction = (text, num) -> text.length() + num;


        SimpleFunctionalInterface text = myText -> Integer.parseInt(myText);
        text.parse("12");


        // Difference between Function And Method
        // accepts arguments
        // return or not
        // !! метода винаги е обвързан с някакъв клас. Методите са винаги в тялото на някои от класовете
        // !! Функциите нямат имена и не са обвързани с класовете
        }
}
