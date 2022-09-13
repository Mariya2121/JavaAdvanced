package StreamFilesDirectoriesExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {
        String path = "C:\\Users\\Mariya\\IdeaProjects\\Java Advanced\\src\\StreamFilesDirectoriesExercise\\input.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            long sum = 0;
            while (line != null){
                char[] charsFromLine = line.toCharArray();
                for (char singleChar : charsFromLine) {
                    sum += singleChar;
                }
                line = bufferedReader.readLine();
            }
            System.out.println(sum);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
