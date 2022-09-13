package GenericsExcercise;

import jdk.jshell.EvalException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swap<T> {
    private List<T> elements;

    public Swap() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public void swapElements(int index1, int index2) {
        T temp = elements.get(index1);

        elements.set(index1, elements.get(index2));
        elements.set(index2, temp);


       // Collections.swap(elements, index1, index2);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T value : elements) {
            stringBuilder.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }
        return stringBuilder.toString();
    }

}
