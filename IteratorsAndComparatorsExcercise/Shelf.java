package IteratorsAndComparatorsExcercise;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Shelf implements Iterable<String>{ //Щанд
    private List<String> fruits;

    public Shelf(String... fruits) {
        this.fruits = Arrays.asList(fruits);
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = 0;
            @Override
            //Има ли още ?
            public boolean hasNext() {
                return index < fruits.size();
            }

            @Override
            public String next() {
                String fruit = fruits.get(index);
                index++;
                return fruit;
            }
        };
    }
}
