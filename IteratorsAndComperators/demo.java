package IteratorsAndComperators;

import java.util.ArrayList;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {

        printObjects("Hello", "world");
        printObjects(10, 13, 54);
        printObjects(new ArrayList<>(), new ArrayList<>());
    }


    // единствения начин да работим с вариращ брой аргументи е те са в края на сигнатурата на метода
    // и да са единствен вариращ брой на аргументи( Не можем да кажем (String..., int...)XXX)

    public static <T> void printObjects(T... objects) { //String... -> вариращ броой на аргументите
        //  String[] strings1 = strings;

        if (objects.length == 0) {
            System.out.println("Please add an input");
        }
        Arrays.stream(objects).forEach(System.out::println);
    }
}
