package CustomListExGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CustomList<T extends Comparable<T>> {
    private List<T> values;

    public CustomList(){
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    public T remove(int index) {
      return values.remove(index);
    }

    public boolean contains(T element) {
        return values.contains(element);
    }

    public void swap(int index1, int index2) {
        Collections.swap(values, index1, index2);
    }

    public long countOfGreaterElements(T element) {
        return values.stream().filter(value -> value.compareTo(element) > 0).count();
    }

    public T max() {
        return Collections.max(values);
    }

    public T min() {
        return Collections.min(values);
    }
    public int size(){
        return values.size();
    }
    public T get(int index){
        return values.get(index);
    }

//    public void print() {
//        for (T value : values) {
//            System.out.println(value);
//        }
//    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (T value : values) {
            stringBuilder.append(String.format("%s%n", value.toString()));
        }
        return stringBuilder.toString().trim();
    }
}
