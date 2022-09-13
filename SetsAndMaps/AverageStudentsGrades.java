package SetsAndMaps;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

//        students.entrySet().forEach(entry ->{
//            double averageGrade = entry.getKey().stream().mapToDouble(x -> x).average().orElse(0.0);
//        });
//
//        students.entrySet((name, grade) -> {
//            double averageGrade = grade.stream().mapToDouble(x -> x).average().orElse(0.0);
//
//            System.out.println(name + " -> " + String.join(" ",gr));
//        });


    }
}
