package Generics;

import javax.swing.text.Utilities;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //ArrayCreator
//        Integer[] integers = ArrayCreator.create(5, 1);
//        // когато работим с generics винаги работим с клас(Integer). Никога с примитивен тип;
//
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }
//
//        Integer[] integers2 = ArrayCreator.create(Integer.class, 5, 2);
//
//        for (Integer in : integers2) {
//            System.out.println(in);
//        }

        //Jar
//        Jar<Integer> jar = new Jar<>();
//        jar.add(10);
//        jar.add(20);
//        jar.remove();

        //Scale
        Scale<Integer> scale = new Scale<>(1,2);
        System.out.println(scale.getHeavier());

        //ListUtils
        List<Integer> list = List.of(13,55,66,77);
        System.out.println(ListUtils.getMax(list));
        System.out.println(ListUtils.getMin(list));
    }
}
