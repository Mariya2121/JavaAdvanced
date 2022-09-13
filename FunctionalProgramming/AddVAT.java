package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // UnaryOperator - фун., която приема един тип, и връща същия тип
        // UnaryOperator<Double> == Function<Double,Double> едно и също


        Consumer<Double> printer = d -> System.out.printf("%.2f%n", d);
        UnaryOperator<Double> addVat = price -> price * 1.20;

        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVat).forEach(printer);
    }
}
