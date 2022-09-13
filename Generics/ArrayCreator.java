package Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {


    public static <T> T[] create(int length, T defValue) { // generic method

        // T[] arr = new T[length]; // не могат да се създавам generic масиви
        T[] arr = (T[]) Array.newInstance(defValue.getClass(), length);
        Arrays.fill(arr, defValue);

        return arr;
    }

    public static <T> T[] create(Class<T> tClass, int length, T defValue) {
        T[] arr = (T[]) Array.newInstance(tClass, length);
        Arrays.fill(arr, defValue);

        return arr;
    }

}
