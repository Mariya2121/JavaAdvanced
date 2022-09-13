package StreamFilesDirectoriesExercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SumLines {
    public static void main(String[] args)  {
        String path = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamFilesDirectoriesExercise\\input.txt";


        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null){
                long sum = 0;
                char[] charsFromLine = line.toCharArray();
                for (char singleChar : charsFromLine) {
                    sum += singleChar;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }

        } catch (IOException e){
           e.printStackTrace();
        }


//        List<String> list = Files.readAllLines(Paths.get(path));
//
//        for (String line : list) {
//            int sum = 0;
//            for (int i = 0; i < line.length(); i++) {
//                int sumSymbol = line.charAt(i);
//                sum += sumSymbol;
//            }
//            System.out.println(sum);
//        }
    }
}
