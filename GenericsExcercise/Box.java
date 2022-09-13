package GenericsExcercise;

import java.util.ArrayList;
import java.util.List;


public class Box<T extends Comparable<T>> {
    private List<T> values;


    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    public long countOfGreaterElements(T element) {
//        int count = 0;
//        for (int i = 0; i < values.size(); i++) {
//            if (values.get(i).compareTo(element) > 0) {
//                count++;
//            }
//        }

      return values.stream().filter(item -> item.compareTo(element) > 0).count();


    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T value : values) {
            stringBuilder.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }
        return stringBuilder.toString();
    }

}
