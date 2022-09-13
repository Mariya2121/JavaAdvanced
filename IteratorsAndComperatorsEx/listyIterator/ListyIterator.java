package IteratorsAndComperatorsEx.listyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private List<String> elements;
    private int index;

    public ListyIterator(String... elements) {
        this.elements = List.of(elements);
        index = 0;
    }

    public boolean hasNext() {
        return (index < elements.size() - 1);

    }

    public boolean move() {
        if (hasNext()) {
            index++;
            return true;
        }
        return false;
    }

    public void print() {
        if (this.elements.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(elements.get(index));

    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index;

            @Override
            public boolean hasNext() {
                return this.index < elements.size();
            }

            @Override
            public String next() {
                String element = elements.get(index);
                index++;
                return element;
            }
        };
    }
}
