package GenericsExcercise;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        System.out.println(min(integerList));

        List<String> stringList = new ArrayList<>();
        stringList.add("Pesho");
        stringList.add("Ivan");
        System.out.println(min(stringList));
    }

    public static <T extends Comparable<T>> T min(List<T> list) {
        T min = list.get(0);
        for (T element : list) {
            if (min.compareTo(element) > 0) {
                min = element;
            }
        }
        return min;
    }
}
